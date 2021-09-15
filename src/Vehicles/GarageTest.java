package Vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Vehicle[] carsInTheGarage = new Vehicle[3];
        carsInTheGarage[0] = new Vehicle("Ferrari");
//        carsInTheGarage[0].setName("Ferrari");
        carsInTheGarage[1] = new Truck("F550");
//        carsInTheGarage[1].setName("F550");
        carsInTheGarage[2] = new BigRig("Peterbilt");
//        carsInTheGarage[2].setName("Peterbilt");
        Garage garage = new Garage();
        garage.vehicles = carsInTheGarage;
        garage.alarmCascade();
        garage.findVehicle("F550", carsInTheGarage);
    }

}
