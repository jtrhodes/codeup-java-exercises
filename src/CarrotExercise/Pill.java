package CarrotExercise;

public class Pill implements Edibles{

    private String medicationName;
    private String pharmacistInstructions;

        // getters setters constructors...

    public void consume() {
        System.out.println("Drink down with fluid");
    }

    public void checkIfExpired() {
        System.out.println("Check expiration date on pill bottle");
    }

    public void throwAway() {
        System.out.println("Wash down sink...");
    }

}
