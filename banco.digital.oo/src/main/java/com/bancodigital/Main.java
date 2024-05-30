package com.bancodigital;

public class Main {
    public static void main(String[] args) {
        // Criando um novo banco
        Banco meuBanco = new Banco("Meu Banco");

        // Criando novos clientes
        Cliente cliente1 = new Cliente("João da Silva");
        Cliente cliente2 = new Cliente("Maria da Conceição");

        // Criando contas para os clientes
        ContaCorrente cc1 = new ContaCorrente(cliente1);
        ContaPoupanca poupanca1 = new ContaPoupanca(cliente1);
        ContaCorrente cc2 = new ContaCorrente(cliente2);

        // Adicionando as contas ao banco
        meuBanco.adicionarConta(cc1);
        meuBanco.adicionarConta(poupanca1);
        meuBanco.adicionarConta(cc2);

        // Realizando operações bancárias
        cc1.depositar(100);
        cc1.transferir(50, poupanca1);
        cc1.sacar(20);
        cc1.realizarPix(30, cc2.getNumero(), meuBanco);
        cc1.solicitarEmprestimo(200);

        // Imprimindo os extratos das contas
        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();
        cc2.imprimirExtrato();
    }
}