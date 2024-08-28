package org.example;

import java.util.ArrayList;
import java.util.SimpleTimeZone;

public class MusicCloud {
    private ArrayList<Music> musiclist = new ArrayList<Music>();

    public void addmusic(String name, String artist){
        Music music = new Music(name,artist);
        musiclist.add(music);

    }

    public Music searchmusic(String term){
        for (Music item : musiclist){
            if(item.getName().equals(term)) return item;
        }
        throw new RuntimeException("A musica não foi encontrada");
    }

}
