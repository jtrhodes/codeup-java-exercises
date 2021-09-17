package Animals;

abstract class Pet {
    protected int age;
    protected int weight;
    protected String species;
    protected String name;
    abstract void responseToCommand(String command);

    protected void rest(int noOfHours) {
        for (int i = 0; i <= noOfHours; i += 1) {
            System.out.println("Zzzzzzz....");
        }
    }
}
