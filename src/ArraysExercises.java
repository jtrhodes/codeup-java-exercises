import java.util.Arrays;
public class ArraysExercises {
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

    public static Persons[] addPersons(Persons[] person, Persons newpersons) {
        Persons[] person2 = Arrays.copyOf(person, person.length +1);
        return person2;
    }
}

