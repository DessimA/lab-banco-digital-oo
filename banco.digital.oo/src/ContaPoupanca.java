// Classe ContaPoupanca extendendo Conta
public class ContaPoupanca extends Conta {
    // Construtor da classe ContaPoupanca
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    // Método para imprimir o extrato da conta poupança
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        imprimirInformacoesBasicas();
        System.out.println();
    }
}