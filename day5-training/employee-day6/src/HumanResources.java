/**
 * Created by rasalp on 7/25/2017.
 */
public class HumanResources {
    public static boolean eligibleForPromotion(String desig) {
        if (desig.equalsIgnoreCase("Member Technical"))
            return true;
        return false;
    }

    public static void changeDesignation(EmployeeService employee) {
        String desig = employee.getDesig();
        if (eligibleForPromotion(desig)) {
            employee.setDesig("Sr. Member Technical");
            System.out.println("Your designation changed to " + employee.getDesig() + ".");
            Finance.updateSalary(employee);
        }
    }
}
