public class MethodWarmup {
    public static void main(String[] args) {
        double x = 5;
        double y = 6;
        System.out.println(getDifference(5,6));
        System.out.println(getDifference(5));
        System.out.println(getDifference(x,y));
        System.out.println(addNums(5));
    }
    public static int getDifference(int num1, int num2) {
        if (num1 < num2) {
            return num2 - num1;
        }return num1 - num2;
    }
        public static int getDifference (int num1){
            return num1;
        }
        public static double getDifference ( double num1, double num2){
            return num1 - num2;
        }
    public static long powersOfTen(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;
        return powersOfTen(n-1) * 10;
    }
    public static int addNums(int n) {
    if(n == 1) return 1;
    return addNums(n -1) + n;
    }

}
