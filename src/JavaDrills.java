import java.util.ArrayList;
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
    static int[] arrayOne = new int[] {2,4,10,9};
    static int[] arrayTwo = new int[] {8,5,3,2};

    public static int returnTotalDifference(int[] secondSumArray,int[] sumArray){
        int sum = 0;
        int secondSum = 0;
        for(Integer num: sumArray){
            sum += num;
        }
        for(Integer num: secondSumArray){
            secondSum += num;
        }
        return sum-secondSum;
    }

//    In `codeup-java-exercises`, in `JavaDrills`:
//    Create a static method, returnTotalDifference, that takes in two lists of integers and returns the difference between the sum of all integers in the first list minus the sum of all integers in the second list.
//            returnTotalDifference(Arrays.asList(10, 2, 3), Arrays.asList(1, 2, 3)); // returns 9
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7)); // returns 3
//    returnTotalDifference(Arrays.asList(10, 1), Arrays.asList(1, 7, 1)); // returns 2
    //    Create a public static method, `flipOuterCase`, that takes in a string and returns the string
//        with the case reversed for the first and last letters. Assume the input will be three or more characters long.
//        Example inputs and expected outputs...
    public static void main(String[] args) {
        System.out.println(returnTotalDifference(arrayOne, arrayTwo));
        System.out.println(flipOuterCase("cat"));
        System.out.println(flipOuterCase("CaT"));
        System.out.println(flipOuterCase("caT"));
        System.out.println(flipOuterCase("cAt"));
    }
}