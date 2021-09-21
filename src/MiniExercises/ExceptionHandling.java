package MiniExercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandling {
    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        String[] stringArray = sentence.split(" ");
        for (String word : stringArray){
            wordArrayList.add(word);
        }
        List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
        String newSentence = String.join(" ", shorterList);
        System.out.println(newSentence);
    }

    public static void main(String[] args) {

        ExceptionHandling ex = new ExceptionHandling();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a sentence");
            String sentence = scanner.nextLine();
            ex.subListMaker(sentence);
        }catch(IllegalAccessError il){
            System.out.println("IllegalAccessError has been caught and is being prosecuted");
        }catch(IllegalArgumentException ol){
            System.out.println("IllegalArguementException has been apprehended and is being detained");
        }catch(InputMismatchException mis){
            System.out.println("InputMismatchException has been identified and is being matched correctly");
        }catch(IndexOutOfBoundsException in){
            System.out.println("IndexOutOfBoundsException has been found out of bounds and is being dragged back in");
        }
    }
}
