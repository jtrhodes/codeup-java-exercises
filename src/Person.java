public class Person {
    private String name;

    public static void main(String[] args) {
        Person jeff = new Person();
        jeff.setName("Jeff");
        System.out.println(jeff.getName());
        jeff.sayHello();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void sayHello(){
        System.out.printf("Hello, %s", getName());
    }
}
