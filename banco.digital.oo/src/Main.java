// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando um novo cliente
        Cliente cliente = new Cliente("João da Silva");

        // Criando uma conta corrente e uma conta poupança para o cliente
        ContaCorrente cc = new ContaCorrente(cliente);
        ContaPoupanca poupanca = new ContaPoupanca(cliente);

        // Testando operações com valores válidos
        cc.depositar(100);
        cc.transferir(50, poupanca);
        cc.sacar(20);

        // Testando operações com valores inválidos
        cc.sacar(1000); // Saldo insuficiente
        cc.transferir(100, poupanca); // Saldo insuficiente
        cc.depositar(-50); // Valor de depósito inválido
        cc.sacar(-20); // Valor de saque inválido
        cc.transferir(-30, poupanca); // Valor de transferência inválido

        // Imprimindo os extratos das contas
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}