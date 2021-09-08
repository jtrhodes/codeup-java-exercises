import java.util.Scanner;

public class Therapist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you doing today?");
        String reply = scanner.nextLine();
        boolean x = true;
        boolean talk = false;
        do {
            if(talk == true){
                System.out.println("What about today has made you this way?");
            }
            if (reply.equals("good") || reply.equals("great")) {
                System.out.println("Awesome that's great to hear do you want to tell me why?");
                talk = true;
            } else if (reply.equals("alright") || reply.equals("okay")) {
                System.out.println("Okay, why is that?");
            } else if (reply.equals("bad") || reply.equals("terrible")) {
                System.out.println("That's awful, do you want to talk about it?");
                reply = scanner.nextLine();
                if(reply.equals("yes")){
                    talk = true;
                }
//                else {
//                    x = false;
//                }
            } else {
                System.out.println("Okay, if you dont feel like talking why did you come in today?");
                x = false;
            }
        }while(x == true);
    }
}
