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
        System.out.println("Enter a new number");
        int newNumber = scanner.nextInt();
        newNumber *= 2;
        if (newNumber < -100){
            System.out.println("Your number is less than -100");
        } else if (newNumber > 100){
            System.out.println("Your number is greater than 100");
        } else{
            System.out.println("Your number is between -100 and 100");
        }

    }
}
//if you finish early and want a greater challenge, write another Java program that takes a hard-coded number, multiplies it by 2, and determines if the result is less than -100, more than 100, or in between, and tells the user
