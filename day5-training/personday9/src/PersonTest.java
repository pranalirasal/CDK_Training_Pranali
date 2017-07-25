import java.net.Inet4Address;
import java.util.HashMap;

/**
 * Created by rasalp on 7/21/2017.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Ramesh", "M");
        Person p2 = new Person("Ramesh", "M");

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        /*System.out.println(p1.equals(null));
        System.out.println(null == null);*/

        /*HashMap <Object, String> hashMap = new HashMap<>();
        System.out.println(Integer.valueOf(1) == Integer.valueOf(1));
        System.out.println(Integer.valueOf(1000) == Integer.valueOf(1000));*/
    }
}
