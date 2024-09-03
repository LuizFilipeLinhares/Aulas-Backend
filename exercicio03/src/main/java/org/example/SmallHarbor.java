package org.example;

public class SmallHarbor extends HarborBase {
    @Override
    public boolean dockBoat (Boat boat){
        if(boat.size <= 10){
            dockBoats.add(boat);
            System.out.println(String.format("%s Atracou! O porto pequeno agradece!", boat.name));
            return true;
        }
        return false;
    }

}
