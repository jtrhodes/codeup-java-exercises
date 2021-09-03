import java.util.Scanner;

public class myIOExperiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userInput = scanner.nextLine();
//        System.out.println("Hello, " + userInput);
        System.out.printf("Hello, %s", userInput);
    }
}
