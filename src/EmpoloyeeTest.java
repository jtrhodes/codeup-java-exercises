public class EmpoloyeeTest {
    public static void main(String[] args) {


        Employee tom = new Employee();
        tom.name = "Tom";

        Employee chet = new Employee();
        chet.name = "Chet";
        chet.displayEmployeeInfo();
        chet.employeeQuote();
    }
}
