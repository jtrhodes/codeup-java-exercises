import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are confronted by a wild Bob! What do you say?");
        String bobAnswer = scanner.nextLine();
        Boolean x = true;
        do {
            if(bobAnswer.contains("no leave")){

            }
            if (bobAnswer.contains("!")) {
                System.out.println("Whoa bro, chill out!");
            } else if (bobAnswer.contains("?")) {
                System.out.println("Sure bruh.");
            } else if (bobAnswer.equals("")) {
                System.out.println("Whatever I didn't feel like talking to you anyway your lame");
            }if (x){
                System.out.println("Bob is still standing in front of you do you still wish to speak to him?");
                bobAnswer = scanner.nextLine();
                if(bobAnswer.equals("yes")){

                }
            }
        }while(x == true);
    }

}
