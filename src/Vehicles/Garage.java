package Vehicles;

public class Garage{
    Vehicle[] vehicles;
    public void alarmCascade(){
        for(Vehicle vehicle : vehicles){
            vehicle.makeNoise();
        }
    }
    public Vehicle findVehicle(String name, Vehicle[] vehicles){
        for(Vehicle vehicle : vehicles){
           if(vehicle.getName().equalsIgnoreCase(name)){
               System.out.println("Found it");
               return vehicle;
           }
        }
        Vehicle notHere = new Vehicle("null");
        System.out.println("that car isnt in here friend");
        return notHere;
    }

    public static void main(String[] args) {

    }
}
