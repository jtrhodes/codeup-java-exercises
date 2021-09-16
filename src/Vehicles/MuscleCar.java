package Vehicles;

public final class  MuscleCar extends Vehicle{
    public void makeNoise(){System.out.println("ZOOM ZOOM ZOOM");
    super.makeNoise();}

    public MuscleCar(String name) {
        super(name);
    }
}
