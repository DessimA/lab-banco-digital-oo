package com.bancodigital;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
class Transacao {
    private String tipo;
    private double valor;
    private double saldo;

    // Construtor da classe Transacao
    public Transacao(String tipo, double valor, double saldo) {
        this.tipo = tipo;
        this.valor = valor;
        this.saldo = saldo;
    }
}