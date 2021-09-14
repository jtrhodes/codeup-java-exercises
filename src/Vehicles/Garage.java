package Vehicles;

public class Garage{
    Vehicle[] vehicles;
    public void alarmCascade(){
        for(Vehicle vehicle : vehicles){
            vehicle.makeNoise();
        }
    }

    public static void main(String[] args) {

    }
}
