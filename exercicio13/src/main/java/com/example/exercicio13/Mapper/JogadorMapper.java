package com.example.exercicio13.Mapper;

import com.example.exercicio13.DTO.JogadorResponseDto;
import com.example.exercicio13.Model.JogadorEntidade;
import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {
    public JogadorResponseDto toDto(JogadorEntidade jogador) {
        return new JogadorResponseDto(
                jogador.getApelido(),
                jogador.getHabilidade()
        );
    }
}
