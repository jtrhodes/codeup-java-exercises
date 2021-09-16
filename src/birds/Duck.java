package birds;

public class Duck extends Bird {
    // let's override the superclass makeNoise() method
    // overriding: when a subclass redefines one if its inherited methods
    // when it needs to change or extend the behavior of that method
    public void makeNoise() {
        System.out.println("Quack Quack");
    }

    public Duck(){
        super("Duck");
    }

    public void setName(String duckName){
//        super.setName(duckName);
        super.name = duckName;
    }

    public Duck(String name){
//        this.setName(name);
        super(name);
        System.out.println("A new duck has been created.");
        incrementTheBirds();
    }
}
