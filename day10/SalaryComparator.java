import java.util.Comparator;

/**
 * Created by rasalp on 7/29/2017.
 */
class SalaryComparator implements Comparator<Employee>{
    public int compare (Employee employee, Employee employee2) {
        if (employee.getSalary() > employee2.getSalary())
            return 1;
        else if (employee.getSalary() < employee2.getSalary())
            return -1;
        else
            return 0;
    }
}
