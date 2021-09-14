import java.util.Arrays;

public class Persons {
    String name;
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

    public Persons(String name) {
        this.name = name;
    }




    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Persons[] person = {
                new Persons("Chucky"),
                new Persons("Tom"),
                new Persons("Carol")
        };
        for (Persons p : person) {
            System.out.println(p.getName());
        }
        }

}
