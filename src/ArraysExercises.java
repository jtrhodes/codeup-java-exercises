import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Chucky"),
                new Person("Tom"),
                new Person("Carol")
        };
        for (Person p : people) {
            System.out.println(p.getName());
        }
        people = addPersons(people, new Person("bobby"));
        System.out.println(people);
    }

    public static Person[] addPersons(Person[] people, Person newPerson) {
        Person[] output = Arrays.copyOf(people,people.length + 1);
        output[people.length] = newPerson;
        return output;
    }
}

