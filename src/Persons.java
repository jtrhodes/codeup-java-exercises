import java.util.Arrays;

public class Persons {
    String name;
    int age;
//    public static Persons[] addPersons(Persons[] person) {
//        Persons[] people = Arrays.copyOf(person, person.length + 1);
//        for(Persons persons : people) {
//            if(persons == null){
//
//            }
//        }
//        System.out.println(Arrays.toString(people));
//        return people;
//    }

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Persons[] person = {
                new Persons("Chucky", 45),
                new Persons("Tom", 25),
                new Persons("Carol", 32)
        };
        for (Persons p : person) {
            System.out.println(p.getName());
        }
        }

}
