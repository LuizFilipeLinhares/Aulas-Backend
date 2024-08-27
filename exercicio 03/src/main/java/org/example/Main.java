package org.example;

public class Main {
    public static void main(String[] args) {
        // Criando a lista de barcos
        Barco[] barcos = {
                new Barco("Barco 1", 5),
                new Barco("Barco 2", 8),
                new Barco("Barco 3", 15),
                new Barco("Barco 4", 12),
                new Barco("Barco 5", 20)
        };

        PortoPequeno portoPequeno = new PortoPequeno("Porto Pequeno", 3);
        PortoGrande portoGrande = new PortoGrande("Porto Grande", 5);

        for (Barco barco : barcos) {
            if (barco.tamanho <= 10) {
                portoPequeno.atracarBarco(barco);
            } else {
                portoGrande.atracarBarco(barco);
            }
        }
    }
}