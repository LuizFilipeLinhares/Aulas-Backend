package com.example.exercicio13.Controller;

import com.example.exercicio13.DTO.JogadorRequestDto;
import com.example.exercicio13.DTO.JogadorResponseDto;
import com.example.exercicio13.Services.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JogadorController {
    @Autowired
    JogadorService jogadorService;

    @PostMapping("/jogadores")
    @ResponseBody
    public JogadorResponseDto insereJogador(@RequestBody @Valid JogadorRequestDto jogadorDto) {
        return jogadorService.insereJogador(jogadorDto);
    }

    @GetMapping("/jogadores")
    @ResponseBody
    public List<JogadorResponseDto> listaJogadores() {
        return jogadorService.retornaJogadores();
    }
}
