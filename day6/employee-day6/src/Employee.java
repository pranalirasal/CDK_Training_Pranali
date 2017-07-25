/**
 * Created by rasalp on 7/25/2017.
 */
public class Employee {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService(101, "XYZ", 100000.00, "2349038492", "Member Technical");
        HumanResources.changeDesignation(employeeService);
        ProjectManager.changeProject(employeeService);
    }
}
