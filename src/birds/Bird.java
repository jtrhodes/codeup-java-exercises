package birds;

public class Bird {
    public static int birdCount;
    // what kind of bird is it?
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Tweet tweet");
    }

    public void move(){
        System.out.println("Flap flap");
    }

//    public Bird(String name){
//        this.name = name;
//    }

    public Bird(){
    incrementTheBirds();
    }

    public Bird(String name){
        this.name = name;
        System.out.println("A new bird has been created.");
        incrementTheBirds();
    }
    public void incrementTheBirds(){
        birdCount++;
        System.out.println("The number of birds in the shelter is now " + birdCount);
    }
}
//Challenge.
//        Modify the Birds class so as to keep count of how many birds are created and output the bird count every time a new bird is created. DRY out the code.