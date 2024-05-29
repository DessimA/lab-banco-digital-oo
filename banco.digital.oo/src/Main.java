public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente("Venilton");

        IGeradorDeNumero geradorDeNumero = new GeradorDeNumeroConta();

        // Passar o gerador para o construtor:
        ContaCorrente cc = new ContaCorrente(venilton, geradorDeNumero);
        ContaPoupanca poupanca = new ContaPoupanca(venilton, geradorDeNumero);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}