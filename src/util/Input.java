
package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString() {
        System.out.println("Please enter a string");
        String userInput = scanner.nextLine();
        return userInput;
    }
    public String getString(String input){
        return input;
    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public boolean yesNo(String input) {
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

//public int getInt(){
//
//}

    public int getInt(){
        int userInput;
        try {
             userInput = Integer.valueOf(getString());
        } catch (NumberFormatException num){
            System.out.println("That is incorrect please try again");
            return getInt();
        }
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
//        System.out.println("Please enter a number");
//        double userInput = scanner.nextDouble();
        double userInput;
        try{
            userInput = Double.valueOf(getString());
        }catch (NumberFormatException num){
            System.out.println("say what again");
            return getDouble();
        }
        return userInput;
    }
    public double getDouble(String prompt){
        System.out.println(prompt);
        double userInput = scanner.nextDouble();
        return userInput;
    }
}
