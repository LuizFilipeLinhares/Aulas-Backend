package org.example;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        //String[]  = {"Agua", "Fogo","Terra","Ar"};

        String[] elements = new String[4];
        elements[0] = "Realmpago Marquinhos Katchau";
        elements[1] = "Carros 3";
        elements[2] = "Carros 2";
        elements[3] = "Carros";



        Scanner scanner = new Scanner(System.in);

        //System.out.println("Digite o primeiro nome:");
        /*String firstName = scanner.nextLine();

        if(firstName == "") return;

        System.out.println("Digite o segundo nome:");
        String secondName = scanner.nextLine();*/

        Random aleatoryObj = new Random();
        Integer aleatoryNumber = aleatoryObj.nextInt( 99);
        Integer aleatoryInd = aleatoryObj.nextInt(4);
        String element = elements[aleatoryInd];

        System.out.println("Eu remocomendaria o: " + element);
    }
}

