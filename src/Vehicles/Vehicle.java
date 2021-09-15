package Vehicles;

public class Vehicle {
    protected String name;
    public Vehicle(String name){
        this.name = name;
    }

    public Vehicle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void makeNoise(){
        System.out.println("Honk Honk. Vroom Vroom");
    }
}

