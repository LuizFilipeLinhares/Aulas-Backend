package com.example.exercicio08;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cars")
public class Controller {

    private static final String URL = "https://api.fipeapi.com.br/v1/carros/marcas/{marca}/modelos/{modelo}/anos/{ano}";

    public static class Carro {
        public String marca;
        public String modelo;
        public String ano;

        // Getters e Setters
        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getAno() {
            return ano;
        }

        public void setAno(String ano) {
            this.ano = ano;
        }
    }

    @PostMapping("/valor-fipe")
    public ResponseEntity<?> obterValorFipe(@RequestBody Carro carro) {
        // Preparar a URL para a requisição à API FIPE
        String url = FIPE_API_URL;

        // Substituir os parâmetros de URL com valores recebidos
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("marca", carro.getMarca());
        uriVariables.put("modelo", carro.getModelo());
        uriVariables.put("ano", carro.getAno());

        // Preparar o RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        try {
            // Fazer a requisição GET para a API FIPE
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, HttpEntity.EMPTY, String.class, uriVariables);

            // Retornar a resposta da API FIPE
            return ResponseEntity.ok(response.getBody());

        } catch (Exception e) {
            // Tratar exceções (ex.: carro não encontrado)
            return ResponseEntity.status(404).body("Erro ao buscar o valor FIPE. Verifique os dados fornecidos.");
        }
    }
}

