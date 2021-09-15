package Vehicles;

import Vehicles.Vehicle;

public class Truck extends Vehicle {
    public Truck(String name){
        super.name = name;
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void makeNoise(){System.out.println("Chug Chug Guzzling that gas");}
    public void breakDown(){super.makeNoise();
        System.out.println("bing bang boom pow");}
}
//    Create a method in the subclass of the Vehicles.Vehicle class that overrides the superclass makeNoise method.
