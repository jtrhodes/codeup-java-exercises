package MiniExercises;

public class ErrorTest {
    public static void main(String[] args) {
        Lizard lizard = new Lizard(null);
//        System.out.println(lizard.name);
        try {
            String string = "Test String";
            System.out.println(string.length());
            string.substring(10, 12);
        }catch(StringIndexOutOfBoundsException str){
            System.out.println(str.getMessage());
//            System.out.println("Caught out a string index out of bounds exception");
        }
    }
}
