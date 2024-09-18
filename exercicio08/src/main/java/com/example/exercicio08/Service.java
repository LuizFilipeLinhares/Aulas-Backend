package com.example.exercicio08;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class MarcasFipeServiceImpl implements CEPService {
    private RestClient client = RestClient.create("https://parallelum.com.br/fipe/api/v1/");

    @Override
    public CEP getMarcas() {
        String tipo = "carros";
        return client
                .get()
                .uri("{tipo}/marcas/", tipo)
                .retrieve()
                .body(Marca[].class);
    }

    @Service
    public class Marca {
        private int codigo;
        private String nome;
    }

}

