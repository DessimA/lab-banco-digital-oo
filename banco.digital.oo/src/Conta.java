// Interface para operações de conta
interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino);
    void imprimirExtrato();
}

// Classe abstrata Conta implementando a interface IConta
public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    // Construtor da classe Conta
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
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
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de depósito inválido. Insira um valor positivo.");
            return;
        }

        saldo += valor;
        adicionarTransacao("Depósito", valor);
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
    protected void adicionarTransacao(String tipo, double valor) {}
}