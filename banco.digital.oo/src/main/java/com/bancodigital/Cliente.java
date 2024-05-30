package com.bancodigital;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
class Cliente {
    private String nome;

    // Construtor da classe Cliente
    public Cliente(String nome) {
        this.nome = nome;
    }
}