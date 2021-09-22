public class MyMathMethods {
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }
    public static double multiply(float num1, float num2){return num1 * num2;}
    public static int quotient(int num1, int num2){return num1 / num2;}
    public static double quotient(double num1, double num2){return num1 / num2;}
    public static int sum(int[] numbers){
        int sum = 0;
        for(Integer num : numbers){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] nums = {5,3,7,3,4,55,3};
        System.out.println(multiply(34.0,48.08));
        System.out.println(sum(new int[] { 1, 2, 3, 4}));
    }
}
