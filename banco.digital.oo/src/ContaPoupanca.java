public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, IGeradorDeNumero geradorDeNumero) {
        super(cliente, geradorDeNumero);
    }

    @Override
    public String imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        return imprimirInformacoesBasicas();
    }
}