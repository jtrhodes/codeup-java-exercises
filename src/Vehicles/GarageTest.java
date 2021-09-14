package Vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Vehicle[] carsInTheGarage = new Vehicle[3];
        carsInTheGarage[0] = new Vehicle();
        carsInTheGarage[0].setName("Ferrari");
        carsInTheGarage[1] = new Truck();
        carsInTheGarage[1].setName("F550");
        carsInTheGarage[2] = new BigRig();
        carsInTheGarage[2].setName("Peterbilt");
        Garage garage = new Garage();
        garage.vehicles = carsInTheGarage;
        garage.alarmCascade();
    }

}
