package com.example.exercicio13.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record JogadorRequestDto(
        @NotBlank @Size(min = 3) String nome,
        @NotNull String apelido,
        @Min(value = 18) Integer idade
) {}
