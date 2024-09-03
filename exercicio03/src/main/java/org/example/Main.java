package com.example;

public class Main {
    public static void main(String[] args) {
        Boat[] boats = new Boat[5];
        BigHarbor bigHarbor = new BigHarbor();
        SmallHarbor smallHarbor  = new com.example.SmallHarbor();

        for(int i = 8; i <= 12; i++){
            boats[i - 8] = new Boat("Barco " + i, i);
            System.out.println(boats[i - 8].name + ": Tamanho " + boats[i - 8].size );
        }

        for(int i = 0; i < boats.length; i++){
            Boat boat = boats[i];

            boolean enterTheHarbor = SmallHarbor.atracarBarco(barco);

            if(enterTheHarbor){
                continue;
            }
            System.out.println(String.format("%s és grande demais para o porto pequeno", boat.name));
            BigHarbor.dockBoat(boat);
        }

    }
}
