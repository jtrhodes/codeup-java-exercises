package Animals;

import Animals.Animal;

public class AnimalTest {
    public void main(String[] args) {
        Pet kitty = new Cat();
        kitty.rest(5);
        kitty.responseToCommand("sit");

    }
}
