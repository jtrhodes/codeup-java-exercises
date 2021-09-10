public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

//    public Animal(String name, String sound) {
//        this.name = name;
//        this.sound = sound;
//    }

public void makeNoise(){
    System.out.println("The noise an" + name +" makes is" + sound);
    Quote.RandomQuote();
}
}

//ublic class Fighter {
//    public String name;
//    public int hitPoints;
//    public int maxDamage;
//
//    public void printStats(){
//        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage.");
//    }
//}