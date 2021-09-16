package Vehicles;

import Vehicles.Truck;
import Vehicles.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle raptor = new Vehicle("Raptor");
//        raptor.setName("Vehicles.Truck");
        raptor.makeNoise();
        System.out.println(raptor.getName());

        Truck chevy = new Truck("chevy");
//        chevy.setName("Raptor");
//        chevy.makeNoise();
        chevy.breakDown();
        System.out.println(chevy.getName());
        Vehicle mustang = new MuscleCar("Mustang");
        mustang.makeNoise();
    }
}