import java.util.ArrayList;
import java.util.List;

/**
 * Created by rasalp on 7/20/2017.
 */
public class PersonData {
    public static void main(String[] args) {
        List<Person> people = createTestData();
        PersonCount.personCount(people);
    }
    private static List<Person> createTestData() {
        List<Person> persons = new ArrayList();

        Person person = new Person("Suresh", Gender.M);
        Person person1 = new Person("Ramesh", Gender.M);
        Person person2 = new Person("Geeta", Gender.F);
        Person person3 = new Person("Suresh", Gender.M);
        Person person4 = new Person("Suresh", Gender.M);
        Person person5 = new Person("Geeta", Gender.F);

        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        return persons;
    }
}
