import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) { System.out.print("Hello, "); System.out.print("World!");
//        int myFavoriteNumber = 22;
//        System.out.println(myFavoriteNumber);
//        String myString = "Chucky" ;
//        System.out.println(myString);
//        long myNumber = 123L;
//        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.println("Your word was " + userInput);
    }


};



