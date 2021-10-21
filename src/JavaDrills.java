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
public static String flipInnerCase(String input){
        for(int i = 0; i < input.length; i++){
            if(i == 0){
                continue;
            }if(i = input.length-1){
                continue;
            }if(input.substring(i) == input.substring(i).toUpperCase(Locale.ROOT)){
                input.substring(i).toLowerCase(Locale.ROOT);
            }else{
                input.substring(i).toUpperCase(Locale.ROOT);
            }
        }
        return input;
}

    public static void main(String[] args) {
        System.out.println(returnTotalDifference(arrayOne, arrayTwo));
        System.out.println(flipInnerCase('cat'));
        System.out.println(flipInnerCase('CaT'));
        System.out.println(flipInnerCase('caT')); // cAT
        System.out.println(flipInnerCase('codeup')); // cODEUp
        System.out.println(flipInnerCase('CoDeup')); // COdEUpsa
    }
}

//In `codeup-java-exercises`, in`JavaDrills`, add the following:
//        Create a public static method, `flipInnerCase`, that takes in a string and returns the string
//        with the case of all letters reversed EXCEPT for the first and last letters. Assume the input will be three or more characters long.
//        Example inputs and expected outputs...
//        System.out.println(flipInnerCase(“cat”)); // cAt
//        System.out.println(flipInnerCase(“CaT”)); // CAT
//        System.out.println(flipInnerCase(“caT”)); // cAT
//        System.out.println(flipInnerCase(“codeup”)); // cODEUp
//        System.out.println(flipInnerCase(“CoDeup”)); // COdEUpsa