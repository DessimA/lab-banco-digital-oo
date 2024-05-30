package com.bancodigital;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
class ContaCorrente extends Conta {
    // Construtor da classe ContaCorrente
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.limiteEmprestimo = 1000; // Define o limite de empréstimo para Conta Corrente
    }

    // Método para imprimir o extrato da conta corrente
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInformacoesBasicas();
        imprimirTransacoes();
    }
}