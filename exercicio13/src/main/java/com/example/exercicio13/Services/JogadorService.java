package com.example.exercicio13.Services;


import com.example.exercicio13.DTO.JogadorRequestDto;
import com.example.exercicio13.DTO.JogadorResponseDto;
import com.example.exercicio13.Mapper.JogadorMapper;
import com.example.exercicio13.Model.JogadorEntidade;
import com.example.exercicio13.Repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class JogadorService {
    @Autowired
    JogadorRepository jogadorRepository;
    @Autowired
    JogadorMapper jogadorMapper;

    public JogadorResponseDto insereJogador(JogadorRequestDto jogadorRequestDto) {
        Integer habilidadeAleatoria = new Random().nextInt(0, 100);
        JogadorEntidade jogador = new JogadorEntidade();
        jogador.setNome(jogadorRequestDto.nome());
        jogador.setApelido(jogadorRequestDto.apelido());
        jogador.setIdade(jogadorRequestDto.idade());
        jogador.setHabilidade(habilidadeAleatoria);
        // Salvar o jogador
        jogadorRepository.save(jogador);
        // Criar o dto de resposta
        return jogadorMapper.toDto(jogador);
    }

    public List<JogadorResponseDto> retornaJogadores() {
        return jogadorRepository.findAll().stream().map(jogadorMapper::toDto).toList();
    }
}
