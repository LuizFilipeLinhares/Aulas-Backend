package com.example;

import org.example.Boat;
import java.util.ArrayList;
import java.util.List;

public class HarborBase  {
    public String name;
    public List<Boat> dockerBoats  = new ArrayList<Boat>();

    public boolean dockerBoat (Boat boat){
        dockerBoats.add(boat);
        System.out.println(dockerBoats);

        return true;
    }

    public void undockBoat (Boat boat){
        dockerBoats.remove(boat);
        System.out.println(dockerBoats);
    }

}
