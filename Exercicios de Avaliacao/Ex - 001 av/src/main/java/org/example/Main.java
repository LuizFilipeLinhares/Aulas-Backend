package org.example;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] movies = {"MIB", "Arrive","Black Knight","Gladiator"};


        System.out.println("Selecione a ambientação do seu filme:");
        System.out.println("1 - Sci - fi");
        System.out.println("2 - Medieval");
        String ambianceOption = scanner.nextInt();

        System.out.println("Selecione o genero do seu filme:");
        System.out.println("1 - Comedia");
        System.out.println("1 - Drama");
        String genOption = scanner.nextInt();

        String filmeRecomendado = movies[ambianceOption + genOption - 2];

        System.out.println(String.format("Eu recomendo o filme: %s", filmeRecomendado));
    }
}




