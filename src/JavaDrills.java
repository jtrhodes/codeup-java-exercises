import java.util.Locale;
//work in progress
public class JavaDrills {
    public static String flipOuterCase(String input) {
        String first = input.substring(0, 1).toUpperCase(Locale.ROOT);
        String substring = input.substring(input.length() - 1, input.length());
        String last = substring.toUpperCase(Locale.ROOT);
        input.replace(input.substring(0, 1), first);
        input.replace(substring, last);
        return input;
    }


    //    Create a public static method, `flipOuterCase`, that takes in a string and returns the string
//        with the case reversed for the first and last letters. Assume the input will be three or more characters long.
//        Example inputs and expected outputs...
    public static void main(String[] args) {


        System.out.println(flipOuterCase("cat"));
        System.out.println(flipOuterCase("CaT"));
        System.out.println(flipOuterCase("caT"));
        System.out.println(flipOuterCase("cAt"));
    }
}