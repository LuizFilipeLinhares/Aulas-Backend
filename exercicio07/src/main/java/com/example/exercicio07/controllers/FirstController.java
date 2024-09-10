package com.example.exercicio07.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    
    @GetMapping("movies")
    public String movies(
        @RequestParam String gen,
        @RequestParam String ambience
        ){
        String[] films = {"MIB", "Arrival", "Shrek", "Gladiator"};

        if (gen.equals("Comedia")) {
            if(ambience.equals("Sci-fi")){
                return films[0];
            } else if(ambience.equals("Medieval")){
               return films[1];
            }
        }

        if (gen.equals("Drama")) {
            if(ambience.equals("Sci-fi")){
               return films[2];
            } else if(ambience.equals("Medieval")){
               return films[3];
            }
        }

        return "We dont find any match for your resouce!";
    } 
}
