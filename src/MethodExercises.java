import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
        System.out.println(addition(5,6));
        System.out.println(subtraction(5,4));
        System.out.println(multiplication(5,50));
        System.out.println(division(25,5));
        System.out.println(modulus(100,5));
        numberRange(1,10);
        factorial(5);
    }
    public static int addition(int num1,int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2) {
        if (num2 != 0)
            return (num1 + multiplication(num1, num2 - 1));
        else {
            return 0;
        }
    }
    public static int division(int num1, int num2){
        return num1 / num2;
    }
    public static int modulus(int num1, int num2){
        return num1 % num2;
    }

    public static int numberRange(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int userInput = sc.nextInt();
        if(userInput > max) return numberRange(min, max);
        if(userInput < min) return numberRange(min, max);
        else System.out.println("Congratz you got the right answer!");
        return userInput;
    }

    public static void factorial(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1-10");
        int num = 1;
        int number = sc.nextInt();
            for(int i=1;i<=number;i++) {
                n = n + i;
            }
        System.out.println("Factorial of "+number+" is: "+n);
    }
}
//    int i,fact=1;
//    int number=5;//It is the number to calculate factorial
//  for(i=1;i<=number;i++){
//          fact=fact*i;
//          }
//          System.out.println("Factorial of "+number+" is: "+fact);
//
//
