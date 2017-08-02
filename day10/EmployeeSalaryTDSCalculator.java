import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rasalp on 7/29/2017.
 */
public class EmployeeSalaryTDSCalculator {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(101, 40000),
                new Employee(102, 50000), new Employee(103, 45000),
                new Employee(105, 40700), new Employee(104, 70000),
                new Employee(106, 55000), new Employee(107, 60000),
                new Employee(101, 50000), new Employee(108, 90000),
                new Employee(109, 40000), new Employee(110, 30000),
                new Employee(112, 60000), new Employee(111, 20000),
                new Employee(113, 80000), new Employee(114, 46000),
                new Employee(116, 90000), new Employee(115, 30000),
                new Employee(117, 45000), new Employee(118, 49000),
                new Employee(120, 86000), new Employee(119, 48000),
                new Employee(121, 673400), new Employee(122, 434000),
                new Employee(124, 34000), new Employee(123, 40000),
                new Employee(125, 456000), new Employee(126, 234000));

        employeeList.stream().filter((employee -> employee.getSalary() >= 50000))
                .map((employee -> employee.getSalary() * 0.1))
                .forEach(val -> System.out.println(val));

        double totalSalary = employeeList.stream().map(employee -> employee.getSalary())
                .reduce((acc, val) -> acc + val).get();
		//Average salary of employees		
        System.out.println("Average: " + totalSalary / employeeList.size());
		
		//Total salary of employees
        System.out.println("Total: " + totalSalary);

		//Employee with maximum salary
        int empid = employeeList.stream().max( (a, b) -> Double.compare(a.getSalary(), b.getSalary())).get().getEmpid();
        System.out.println("Employee with maximum salary: " + empid) ;

		//Employee with minimum salary
        int empid1 = employeeList.stream().min( (a, b) -> Double.compare(a.getSalary(), b.getSalary())).get().getEmpid();
        System.out.println("Employee with maximum salary: " + empid1) ;

		//Total number of employees
        long count = employeeList.stream().count();
        System.out.println("Total number of employees: " + count);
    }
}

