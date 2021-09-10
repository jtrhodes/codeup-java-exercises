public class Employee {
    public String name;
    public static String company = "Veridian Dynamics";
    public void displayEmployeeInfo(){
        System.out.printf("%s works at %s",name,company);
    }
    public void employeeQuote(){
        Quote.RandomQuote();
    }
}
