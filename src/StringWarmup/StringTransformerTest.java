package StringWarmup;

public class StringTransformerTest {
    public static void main(String[] args) {
        //iterating through an array of characters and printing them out
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};


        for (char item: vowels) {
            System.out.println(item);
        }
        //Iterating through an array of numbers and getting the sum
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;

        for (int number: numbers) {
            sum += number;
        }
        System.out.println("Sum = " + sum);


        StringTransformer upperCase = new UpperCaseStringTransformer("codeup ftw");
        StringTransformer reverse = new ReverseStringTransformer("this is gonna be reversed");
        StringTransformer lowerCase = new LowerCaseStringTransformer("CODEUP IS THE BEST");

        StringTransformer[] testing = {upperCase, lowerCase, reverse};
        for(StringTransformer t : testing){
            System.out.println(t.transform());
        }
    }
}
