package com.example.exercicio08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarrosController {
    @Autowired
    private IMarcasService marcasService;


    @GetMapping("/marcas")
    @ResponseBody
    public Marca[] postagens() {
        return marcasService.getMarcas();
    }
    @RestController
    public interface MarcasService {
        public Object getMarcas();
    }
