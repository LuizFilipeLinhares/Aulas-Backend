package com.example.exemplo06.controllers;

import com.example.exemplo06.services.ExercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex")
public class DemoController {
    @Autowired
    private ExercicioService exercicioService;
    @GetMapping("/recomend")
    public String recomendaFilme(
        @RequestParam String ambience, @RequestParam String gen){
        return exercicioService.recomendaFilme(ambience, gen);
    }
}
