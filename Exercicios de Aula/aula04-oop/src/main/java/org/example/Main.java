package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       MusicRepository luizfy = new MusicRepository();

       luizfy.addmusic("Georgia","Vance Joy");
       luizfy.addmusic("Canção Infantil","Cezar MC");
       luizfy.addmusic("secretaria","Amado Batista");

       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite o nome de uma musica");
       String search = scanner.nextLine();
       try{
       Music searchedMusic =  luizfy.searchmusic(search);

       System.out.println("Nome da musica:" + searchedMusic.getName());
       System.out.println("Nome do Artista: " + searchedMusic.getArtist());
       } catch (RuntimeException conflito) {
           System.out.println("A musica " + searchedMusic + " não foi encontrada");
       }
    }
}

