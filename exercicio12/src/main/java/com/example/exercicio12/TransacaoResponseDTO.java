package com.example.exercicio12;

public record TransacaoResponseDTO(ContaDTO origem, ContaDTO destino, Double valor) {
}
