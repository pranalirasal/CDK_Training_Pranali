import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rasalp on 7/18/2017.
 */
public class Employee {
    private int empid;
    private String empName;
    private Date dateOfBirth;
    private Date dateOfJoining;
    private String department;
    private String location;

    public Employee(int empid, String name, Date dateOfBirth, Date getDateOfJoining, String department, String location) {
        this.empid = empid;
        this.empName = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = getDateOfJoining;
        this.department = department;
        this.location = location;
    }
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MMMM-dd");
        String dateBirth = date.format(this.dateOfBirth);

        return this.empName + " " + dateBirth;
    }
}
