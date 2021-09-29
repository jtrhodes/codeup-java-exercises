package movies;

public class MovieTest {
    public static void main(String[] args) {
      Comedy comedy = new Comedy("Speed Racer", "The Wachowskis", true);
        System.out.println(comedy.funny);
        System.out.println(comedy.audienceReaction());

    }
}
