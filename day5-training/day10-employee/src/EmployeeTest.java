
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by rasalp on 7/22/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = createTestData();
        EmployeeComparator employeeComparator = new EmployeeComparator();
        employees.sort(employeeComparator);
        //Collections.sort(employees, employeeComparator);
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public static List<Employee> createTestData() {
        List<Employee> employees = new ArrayList();
        Employee employee = new Employee("Ramesh", "Patil", "IT", 201, Location.HYDERABAD);
        Employee employee1 = new Employee("Suresh", "Jagtap", "Finance", 202, Location.PUNE);
        Employee employee2 = new Employee("Ramesh", "Patil", "Operations", 208, Location.PUNE);
        Employee employee3 = new Employee("Ramesh", "Badkas", "Finance", 299, Location.HYDERABAD);
        Employee employee4 = new Employee("Tejas", "Patil", "HR", 203, Location.PUNE);
        Employee employee5 = new Employee("Preeti", "Sharma", "IT", 205, Location.HYDERABAD);
        Employee employee6 = new Employee("Veerendra", "Williams", "Operations", 206, Location.PUNE);
        Employee employee7 = new Employee("Vineet", "Kumbhojkar", "HR", 274, Location.HYDERABAD);
        Employee employee8 = new Employee("Prakash", "Patil", "IT", 223, Location.HYDERABAD);
        Employee employee9 = new Employee("Kushal", "Kale", "Finance", 212, Location.PUNE);
        Employee employee10 = new Employee("Vinaya", "Patil", "Operations", 218, Location.PUNE);
        Employee employee11 = new Employee("Aditi", "Badkas", "Finance", 209, Location.HYDERABAD);
        Employee employee12 = new Employee("Chaitanya", "Patil", "HR", 213, Location.PUNE);
        Employee employee13 = new Employee("Piya", "Sharma", "IT", 225, Location.HYDERABAD);
        Employee employee14 = new Employee("Veerendra", "Verma", "Operations", 226, Location.PUNE);
        Employee employee15 = new Employee("Manmeet", "Kumbhojkar", "HR", 234, Location.HYDERABAD);
        Employee employee16 = new Employee("Ramesh", "Patil", "IT", 291, Location.HYDERABAD);
        Employee employee17 = new Employee("Rohit", "Rajput", "Finance", 292, Location.PUNE);
        Employee employee18 = new Employee("Jagjeet", "Singh", "Operations", 908, Location.PUNE);
        Employee employee19 = new Employee("Akshay", "Shinde", "Finance", 289, Location.HYDERABAD);
        Employee employee20 = new Employee("Shyam", "Jagtap", "HR", 283, Location.PUNE);
        Employee employee21 = new Employee("Ruta", "Sharma", "IT", 285, Location.HYDERABAD);
        Employee employee22 = new Employee("Supriya", "Vijeta", "Operations", 286, Location.PUNE);
        Employee employee23 = new Employee("Sonali", "Rai", "HR", 284, Location.HYDERABAD);

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);
        employees.add(employee11);
        employees.add(employee12);
        employees.add(employee13);
        employees.add(employee14);
        employees.add(employee15);
        employees.add(employee16);
        employees.add(employee17);
        employees.add(employee18);
        employees.add(employee19);
        employees.add(employee20);
        employees.add(employee21);
        employees.add(employee22);
        employees.add(employee23);

        return employees;
    }
}
