package com.example.exemplo06.services;

import org.springframework.stereotype.Service;

@Service
public class ExercicioService {
    public String recomendaFilme(String ambience, String gen){
        if(ambience.equalsIgnoreCase("sci-fi")&& gen.equalsIgnoreCase("comedia"))
            return "MIB";
        if(ambience.equalsIgnoreCase("sci-fi")&& gen.equalsIgnoreCase("drama"))
            return "Arrival";
        if(ambience.equalsIgnoreCase("medieval")&& gen.equalsIgnoreCase("comedia"))
            return "Shrek";
        if(ambience.equalsIgnoreCase("medieval")&& gen.equalsIgnoreCase("drama"))
            return "Gladiator";
        return "We dont have any match";

    }
}
