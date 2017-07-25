import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by rasalp on 7/18/2017.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeTest employeeTest = new EmployeeTest();
        List<Employee> employees = employeeTest.createTestData();
        EmployeeCompareImpl employeeCompare = new EmployeeCompareImpl();

        MyUtil myUtil = new MyUtil();
        CompareName compareName = new CompareName();

        Employee[] employee = employees.toArray(new Employee[]{});
        employee = myUtil.sort(employee, employeeCompare);
        for (Employee emp : employee) {
            System.out.println(emp);
        }
        System.out.println("----------------------------------------------");

        employee = myUtil.sort(employee, compareName);
        for (Employee emp : employee) {
            System.out.println(emp);
        }
        /*for (Employee emp : employees) {
            System.out.println("Employee ID: " + emp.getEmpid());
            System.out.println("Employee Name: " + emp.getEmpName());
            System.out.println("Employee Date of Birth: " + emp.getDateOfBirth());
            System.out.println("Employee Date of Joining: " + emp.getDateOfJoining());
            System.out.println("Employee Department: " + emp.getDepartment());
            System.out.println("Employee Location: " + emp.getLocation());
            System.out.println("Employee name and date of birth: " + emp.toString());
            System.out.println("-------------------------------------------------");
        }*/


    }
    public List<Employee> createTestData() {
        List<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new Employee(101, "Pranali", new Date(96, 5, 25), new Date(117, 7, 7), "IT", "Pune");
        Employee e2 = new Employee(102, "Rohit", new Date(97, 4, 20), new Date (117, 4, 30), "IT", "Pune");
        Employee e3 = new Employee(105, "Prakash", new Date(90, 1, 23), new Date(116, 3, 19), "Operations", "Hyderabad");
        Employee e4 = new Employee(104, "Akshay", new Date(89, 3, 23), new Date(111, 3, 9), "Operations", "Hyderabad");
        Employee e5 = new Employee(106, "Pradnya", new Date(87, 2, 23), new Date(112, 2, 27), "IT", "Pune");
        Employee e6 = new Employee(103, "Vidya", new Date(60, 11, 23), new Date(101, 6, 30), "HR", "Hyderabad");
        Employee e7 = new Employee(107, "Anish", new Date(91, 10, 23), new Date(105, 7, 5), "Finance", "Pune");
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);

        return employees;
    }
}
