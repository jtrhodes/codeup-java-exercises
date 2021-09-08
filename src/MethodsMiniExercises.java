import java.util.Scanner;

public class MethodsMiniExercises {

    // TODO: break the following code apart into a few methods
    public static void main(String[] args) {
        inputLength(userInput(), userNumber());
        Scanner scanner = new Scanner(System.in);
    }
    public static String userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an input.");
        String stringInput = sc.nextLine();
        return stringInput;
    }
public static int userNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter an integer.");
    int intInput = scanner.nextInt();
    return intInput;
}
public static void inputLength(String input, int num){
    if (input.length() == num) {
        System.out.println("That matches the length of the input!");
    } else {
        System.out.println("That doesn't match the length of the input!");
    }
}
}