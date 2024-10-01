package com.example.aula10.Controller;

import com.example.aula10.Model.Jogador;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class Controller {
    @GetMapping("/mundo")
    public String helloWorld(@RequestParam String nomeEstudante, @RequestParam String sobrenomeEstudante){
        return "Ola, " + nomeEstudante + " " + sobrenomeEstudante;
    }

    @PostMapping("/jogador")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Jogador processaJogador(@RequestBody Jogador jogador){
        jogador.setNome("Ronaldinho");
        jogador.setSobrenome("Gaucho");
        return jogador;
    }

    @GetMapping("/sobre")
    @ResponseBody
    public HashMap<String, String> sobre() {
        HashMap<String, String> sobre = new HashMap<>();
        sobre.put("projeto", "Gerador de Jogadores de Futebol");
        sobre.put("nome", "luiz linhares");
        sobre.put("codigo", "12345654");
        return sobre;
    }
}



