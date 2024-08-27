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
        String ambianceOption = scanner.nextLine();

        System.out.println("Selecione o genero do seu filme:");
        System.out.println("1 - Comedia");
        System.out.println("2 - Drama");
        String genOption = scanner.nextLine();

        if (ambianceOption.equals("1")) {
            if(genOption.equals("1")){
                System.out.println(String.format("Eu indicaria o:  %s", movies[0]));
            } else if(genOption.equals("2")){
                System.out.println(String.format("Eu indicaria o: %s", movies[1]));
            }
        }
        if (ambianceOption.equals("2")) {
            if(genOption.equals("1")){
                System.out.println(String.format("Eu indicaria o: é %s", movies[2]));
            } else if(genOption.equals("2")){
                System.out.println(String.format("Eu indicaria o: é %s", movies[3]));
            }
        }

        scanner.close();
    }
}





