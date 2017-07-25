import com.sun.org.apache.xpath.internal.SourceTree;
import org.omg.CORBA.PERSIST_STORE;

import java.util.*;

/**
 * Created by rasalp on 7/20/2017.
 */
public class PersonCount {
    public static void personCount (List<Person> people){
        Map<String, Integer> personCount = new HashMap<String, Integer>();

        for (Person person : people) {
            Integer oldCount = personCount.get(person.getName());
            if (oldCount == null) {
                oldCount = 0;
            }
            personCount.put(person.getName(), oldCount + 1);
        }
        for (String word : personCount.keySet())
            System.out.println(word + ": " + personCount.get(word));
    }
}
