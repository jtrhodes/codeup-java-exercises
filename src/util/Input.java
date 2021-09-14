
package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString() {
        System.out.println("Please enter a string");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public boolean yesNo(String input) {
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }
    public int getInt(){
        System.out.println("Please enter an integer");
        int userInput = scanner.nextInt();
        return userInput;
    }
    public int getInt(int min, int max){
        System.out.println("Enter an integer between " + min + " and " + max);
        int userInput = scanner.nextInt();
        if (userInput > min || userInput < max){
            userInput = getInt(min,max);
        }
        return userInput;
    }
    public int getDouble(double min, double max){
        System.out.println("Enter an integer between " + min + " and " + max);
        int userInput = scanner.nextInt();
        if (userInput > min || userInput < max){
            userInput = getDouble(min,max);
        }
        return userInput;
    }
    public double getDouble(){
        System.out.println("Please enter a number");
        double userInput = scanner.nextDouble();
        return userInput;
    }
    public double getDouble(String prompt){
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        return userInput;
    }
}