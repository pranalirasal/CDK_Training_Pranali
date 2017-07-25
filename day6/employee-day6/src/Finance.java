/**
 * Created by rasalp on 7/25/2017.
 */
public class Finance {
    static double salary;

    public static double updateSalary (EmployeeService employeeService) {
        salary = employeeService.getSalary();
        employeeService.setSalary(salary + 10000);
        System.out.println("Salary updated for " + employeeService.getEmpId() + " " + employeeService.getName());
        updateTDS();
        return salary;
    }

    public static void updateTDS () {
        System.out.println("TDS updated");
    }
}
