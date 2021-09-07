import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = 5;
        while (f <= 15){
            System.out.printf("%s%s", f, " ");
            f++;
        }
        int v = 0;
        do{
            v += 2;
            System.out.printf("Your number is %s%n", v);
        }while( v < 100);
        int d = 100;
        do{
            d -= 5;
            System.out.printf("Your number is %s%n", d);
        }while( d > -10);
        long s = 2;
        do {
            System.out.printf("Your number squared is %s%n", s);
            s = s * s;
        }while(s < 1000000);
        for(int i = 100; i >= -10; i -= 5){
            System.out.println(i);
        }
        for(long i = 2; i < 1000000; i *= i){
            System.out.println(i);
        }
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

        String question = "yes";
        do {
            System.out.println("What number would you like to go up to?");
            int num = scanner.nextInt();
            System.out.printf("Number %s%s%n","| squared ", "| cubed");
            for (long i = num; i > 0; i--) {
                System.out.printf("%s%s%s%s%s%n", i, " | ", (i * i), " | ", Math.pow(i, 3));
            }
            String ghostString = scanner.nextLine();
            System.out.println("Do you wish to continue?");
            question = scanner.nextLine();
        } while((question.equals("yes")));
        System.out.println("Fine il go square my own numbers");

//        next problem
        String answer;
       do {
           System.out.println("Enter a Grade between 0-100");
           int grade = scanner.nextInt();
           if (grade >= 88) {
               System.out.println("Your grade is an A");
           } else if (grade <= 87 && grade >= 80) {
               System.out.println("Your grade is a B");
           } else if (grade <= 79 && grade >= 67) {
               System.out.println("Your grade is a C");
           } else if (grade <= 66 && grade >= 60) {
               System.out.println("Your grade is a D");
           } else {
               System.out.println("Your grade is an F");
           }
           String ghostStrings = scanner.nextLine();
           System.out.println("Do you want to enter another grade?");
           answer = scanner.nextLine();
       }while(answer.equals("yes"));
        System.out.println("Fine il go grade my own papers!");
    }
}
