import java.util.Scanner;

public class MiniExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number");
//        int number = scanner.nextInt();
//        if (number < 0 ) {
//            System.out.println("The number you entered is negative");
//        } else{
//            System.out.println("The number you entered his positive");
//        }
//        System.out.println("Enter a new number");
//        int newNumber = scanner.nextInt();
//        newNumber *= 2;
//        if (newNumber < -100){
//            System.out.println("Your number is less than -100");
//        } else if (newNumber > 100){
//            System.out.println("Your number is greater than 100");
//        } else{
//            System.out.println("Your number is between -100 and 100");
//        }
//        String ghostString = scanner.nextLine();
//        System.out.println("What is your favorite quote?");
//        String quote = scanner.nextLine();
//        System.out.printf("Your favorite quote is %s%n", quote);
//        System.out.println(" How many words are in your favorite quote?");
//        int quoteLength = scanner.nextInt();
//        System.out.printf(" You said your quote contained %s %s%n", quoteLength, "words");
//        String[] quoteWords;
//        quoteWords = quote.split(" ");
//        System.out.println(quoteWords);
//        if( quote.length() == quoteLength){
//            System.out.println("That is correct");
//        }
        System.out.println("What is your age?");
        int personAge = scanner.nextInt();
        if( personAge < 20 && personAge >= 13){
            System.out.println("You sir are a teenager");
        } else if(personAge < 13) {
            System.out.println("You shouldn't be playing with computers at your age");
        } else {
            System.out.println("Okay, boomer");}
    }
}
//if you finish early and want a greater challenge, write another Java program that takes a hard-coded number, multiplies it by 2, and determines if the result is less than -100, more than 100, or in between, and tells the user
//1. Prompt the user to enter a favorite quote
//        - output the quote
//        - ask them to enter how many words are in the quote
//        - output the number they entered
//        - output if the number they entered indeed matched the number of words
