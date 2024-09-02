package com.example;

import org.example.BigHarbor;

public class Main {
    public static void main(String[] args) {
        Boat[] boats = new Boat[5];
        BigHarbor bigharbor = new BigHarbor();
        SmallHarbor smallharbor  = new SmallHarbor();

        for(int i = 8; i <= 12; i++){
            boats[i - 8] = new Boat("Barco " + i, i);
            System.out.println(boats[i - 8].name + ": Tamanho " + boats[i - 8].size );
        }

        for(int i = 0; i < boats.length; i++){
            Boat barco = boats[i];

            boolean entrarNoPortoPequeno = SmallHarbor.atracarBarco(barco);

            if(entrarNoPortoPequeno){
                continue;
            }
            System.out.println(String.format("%s muito grande para o porto pequeno", barco.name));
            BigHarbor.atracarBarco(barco);
        }

    }
}
