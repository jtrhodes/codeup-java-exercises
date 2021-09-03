import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately: %.2f%n", pi);
//        System.out.println("Please Enter a Number");
//        int enteredNumber = Integer.parseInt(scanner.nextLine());
//        System.out.printf("You Entered %d%n", enteredNumber);
//        System.out.println("please Enter a string");
        System.out.println("Enter three words please");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("Your words were %n%s%n %s%n %s%n",firstWord,secondWord,thirdWord);
//        String ghostString = scanner.nextLine();
//        System.out.println("Explain Java in one sentence");
//        String javaExplanation = scanner.nextLine();
//        System.out.printf("Your explanation of java was, %s", javaExplanation);
        System.out.println("What is the width and length of Codeup?");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int area = width * height;
        int perimeter = width * 2 + height * 2;
        System.out.printf("The area of codeup is %s %s %s", area, "The perimeter of codeup is", perimeter);
    }
}
