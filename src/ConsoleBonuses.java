import java.util.Scanner;

public class ConsoleBonuses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want to multiply!");
        int mulNum = scanner.nextInt();
        for(int i = mulNum; i > 0; i--){
            String totalNums = "" ;
            totalNums += i;
            System.out.println(totalNums);
        }
    }
}
