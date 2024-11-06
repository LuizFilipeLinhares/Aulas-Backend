package com.example.exercicio12;

public class ContaMapper {

    public static ContaDTO toContaDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getCliente());
    }
}

