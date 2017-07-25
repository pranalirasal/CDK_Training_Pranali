/**
 * Created by rasalp on 7/19/2017.
 */
public class CompareName implements Compare{
    public boolean compare (Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return (e1.getEmpName().compareTo(e2.getEmpName()) > 0);
    }
}
