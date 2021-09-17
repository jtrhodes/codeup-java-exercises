package Animals;

public class Cat extends Pet{

    @Override
    void responseToCommand(String command) {
        System.out.println("ngMeow... coughs up hairball...");
    }
}