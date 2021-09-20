package MiniExercises;

import java.util.ArrayList;

public class CollectionsTest {

//    public ArrayList<Integer> numArray = {1,2 ,4 ,5,7,2,4,2};
    public static ArrayList<Integer> omit2s(ArrayList <Integer> numbers){
        ArrayList<Integer> numArray = new ArrayList<>();
        for(Integer number : numbers) {
            if (number == 2) continue;
            else numbers.add(number);
        }
        return numArray;
    }

    public static void main(String[] args) {
            ArrayList<Integer> numberArray = new ArrayList<>();
            numberArray.add(4);
            numberArray.add(5);
            numberArray.add(2);
        System.out.println(omit2s(numberArray));
    }
}
