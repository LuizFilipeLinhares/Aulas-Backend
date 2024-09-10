package com.example.exemplo06.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mundo")
public class HelloController {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Ola mundo!";
    }
}
