package com.bancodigital;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
// Classe Banco
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    // Construtor da classe Banco
    public Banco(String nome) {
        this.nome = nome;
    }

    // Método para adicionar uma conta ao banco
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Método para remover uma conta do banco
    public void removerConta(Conta conta) {
        contas.remove(conta);
    }

    // Método para buscar uma conta por número
    public Conta buscarContaPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
}