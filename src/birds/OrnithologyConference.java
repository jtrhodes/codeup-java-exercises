package birds;

public class OrnithologyConference {
    public static void main(String[] args) {
        Bird cardinal = new Bird("cardinal");
//        cardinal.setName("cardinal");
        Ornithologist drKook = new Ornithologist();
        drKook.changeBirdName(" Tweety bird ", cardinal);
    }
}
