import java.util.ArrayList;
import java.util.List;

// Classe ContaCorrente extendendo Conta
public class ContaCorrente extends Conta {
    private List<Transacao> transacoes;

    // Construtor da classe ContaCorrente
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.transacoes = new ArrayList<>();
    }

    // Método para imprimir o extrato da conta corrente
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInformacoesBasicas();
        imprimirTransacoes();
    }

    // Método para adicionar uma nova transação
    @Override
    protected void adicionarTransacao(String tipo, double valor) {
        this.transacoes.add(new Transacao(tipo, valor, this.saldo));
    }

    // Método auxiliar para imprimir as transações
    private void imprimirTransacoes() {
        for (Transacao transacao : transacoes) {
            System.out.println(transacao);
        }
        System.out.println();
    }
}