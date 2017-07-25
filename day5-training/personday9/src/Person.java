import java.util.Objects;

/**
 * Created by rasalp on 7/21/2017.
 */
public class Person {
    private String name;
    private String gender;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        Person p = (Person) obj;
        if (p.getName().equals(this.getName()) && p.getGender().equals(p.getGender())) {
//            System.out.println("Person p1 and p2 are equal");
            return true;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
