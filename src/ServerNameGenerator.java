public class ServerNameGenerator {
    private static String[] adjectives = {"adventurous", "aggressive", "brave", "breakable", "bright", "busy", "calm", "careful", "cautious", "charming"};
    private static String[] nouns = {"actor","gold","painting","airport","guitar","piano","hair","pillow","pizza","animal"};
    public static String getRandom(String[] array) {
        return array[(int) (Math.random() * array.length)];
    }

    public static void main(String[] args) {
        System.out.printf("Your server name is %n%s%s%s",getRandom(adjectives),"-", getRandom(nouns));
    }
}
