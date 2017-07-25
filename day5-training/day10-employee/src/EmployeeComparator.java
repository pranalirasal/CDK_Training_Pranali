import java.util.Comparator;

/**
 * Created by rasalp on 7/22/2017.
 */
public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2){

        if (o1.getLocation().compareTo(o2.getLocation()) != 0)
            return -(o1.getLocation().compareTo(o2.getLocation()));
        if (o1.getDeptName().compareTo(o2.getDeptName()) != 0)
            return (o1.getDeptName().compareTo(o2.getDeptName()));
        if (o1.getFname().compareTo(o2.getFname()) != 0)
            return (o1.getFname().compareTo(o2.getFname()));
        if (o1.getLname().compareTo(o2.getLname()) != 0)
            return (o1.getLname().compareTo(o2.getLname()));
        return o1.getEmpId() - o2.getEmpId();
    }
}
