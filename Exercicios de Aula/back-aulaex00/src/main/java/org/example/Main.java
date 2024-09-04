package org.example;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in)

    //String[] elements = {"Agua", "Fogo","Terra","Ar"};



        System.out.println("Qual ambientação você prefere?");
        System.out.println("1 - Sci-fi");
        System.out.println("2 - Medieval");
        Integer opcaoAmbiente = leitor.nextInt();

        System.out.println("Qual genero você prefere?");
        System.out.println("1 - Comedia");
        System.out.println("2 - Drama");
        Integer opcaoGen  = leitor.nextInt();

        /*if(opcaoAmbiente == 1 && opcaoGen == 1) System.out.println("MIB");
        if(opcaoAmbiente == 1 && opcaoGen == 2) System.out.println("Arrive");
        if(opcaoAmbiente == 2 && opcaoGen == 1) System.out.println("Time line");
        if(opcaoAmbiente == 2 && opcaoGen == 2) System.out.println("Gladiator");*/


    }
}

