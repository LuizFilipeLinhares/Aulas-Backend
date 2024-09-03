package org.example;

import java.util.ArrayList;
import java.util.List;

public class HarborBase  {
    public String name;
    public List<Boat> dockBoats  = new ArrayList<Boat>();

    public static boolean dockerBoat(Boat boat){
        dockBoats.add(boat);
        System.out.println(dockBoats);

        return true;
    }

    public void undockBoat (Boat boat){
        dockBoats.remove(boat);
        System.out.println(dockBoats);
    }

}
