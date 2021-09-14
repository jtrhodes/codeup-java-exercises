package Vehicles;

import Vehicles.Vehicle;

public class Truck extends Vehicle {
    public void makeNoise(){System.out.println("Chug Chug Guzzling that gas");}
    public void breakDown(){super.makeNoise();
        System.out.println("bing bang boom pow");}
}
//    Create a method in the subclass of the Vehicles.Vehicle class that overrides the superclass makeNoise method.
