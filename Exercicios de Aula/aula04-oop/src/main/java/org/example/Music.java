package org.example;

public class Music {
    private String name;
    private String artist;

    public Music(String name, String artist){
        System.out.println("construtor inicado");
        this.name = name;
        this.artist = artist;
    }

    public String getName(){
        return this.name;
    }

    public String getArtist(){
        return this.artist;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }
}



