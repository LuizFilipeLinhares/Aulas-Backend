package com.example;

import org.example.Boat;
import org.example.HarborBase;

public class BigHarbor extends HarborBase {
    @Override
    public boolean dockBoat (Boat boat){
        if(boat.size >= 10){
            dockerBoats.add(boat);

            System.out.println(String.format("%s atracou!", boat.name));
            return true;
        }
        System.out.println("Não é possivel atracar, va para o porto grande");
        return false;
    }
}
