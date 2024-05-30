// Interface para operações de conta

import java.util.ArrayList;
import java.util.List;

interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino);
    void imprimirExtrato();
}

// Classe abstrata Conta implementando a interface IConta
abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<Transacao> transacoes = new ArrayList<>();
    protected double limiteEmprestimo;
    protected double valorEmprestado;

  // Construtor da classe Conta - modificado para iniciar o saldo como 0
  public Conta(Cliente cliente) {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
    this.saldo = 0.0; // Inicializa o saldo como 0
    this.limiteEmprestimo = 0; 
    this.valorEmprestado = 0; 
}

    // Métodos para saque, depósito e transferência
    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de saque inválido. Insira um valor positivo.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente para sacar.");
            return;
        }
        saldo -= valor;
        adicionarTransacao("Saque", -valor);
        System.out.println("Saque realizado com sucesso!");
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de depósito inválido. Insira um valor positivo.");
            return;
        }

        saldo += valor;
        adicionarTransacao("Depósito", valor);
        System.out.println("Depósito realizado com sucesso!");
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de transferência inválido. Insira um valor positivo.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente para transferir.");
            return;
        }

        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Transferência realizada com sucesso!");
    }

    // Método para realizar um Pix
    public void realizarPix(double valor, int numeroContaDestino, Banco bancoDestino) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de Pix inválido. Insira um valor positivo.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente para realizar o Pix.");
            return;
        }

        // Encontra a conta de destino no banco informado
        Conta contaDestino = bancoDestino.buscarContaPorNumero(numeroContaDestino);

        if (contaDestino == null) {
            System.out.println("Erro: Conta de destino não encontrada.");
            return;
        }

        // --- Manipulação direta das transações e saldos ---
        this.saldo -= valor;
        contaDestino.saldo += valor;
        
        this.adicionarTransacao("Pix - Enviado", -valor); 
        contaDestino.adicionarTransacao("Pix - Recebido", valor); 

        System.out.println("Pix realizado com sucesso para " + contaDestino.cliente.getNome() + "!");
    }

    // Método para solicitar empréstimo
    public void solicitarEmprestimo(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de empréstimo inválido. Insira um valor positivo.");
            return;
        }

        if (valor > this.limiteEmprestimo) {
            System.out.println("Erro: Valor do empréstimo excede o limite disponível.");
            return;
        }

        this.saldo += valor;
        this.valorEmprestado += valor;
        adicionarTransacao("Empréstimo", valor);
        System.out.println("Empréstimo realizado com sucesso!");
    }

    // Getters para agência, número e saldo
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para imprimir informações básicas da conta
    protected void imprimirInformacoesBasicas() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    // Método para adicionar uma nova transação (para subclasses)
    protected void adicionarTransacao(String tipo, double valor) {
        this.transacoes.add(new Transacao(tipo, valor, this.saldo));
    }

    // Método para imprimir as transações
    protected void imprimirTransacoes() {
        for (Transacao transacao : transacoes) {
            System.out.println(transacao);
        }
        System.out.println();
    }
}