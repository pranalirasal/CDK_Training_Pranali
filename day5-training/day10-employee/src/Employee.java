/**
 * Created by rasalp on 7/22/2017.
 */
public class Employee {
    String fname;
    String lname;
    String deptName;
    int empId;
    Location location;

    public Employee(String fname, String lname, String deptName, int empId, Location location) {
        this.fname = fname;
        this.lname = lname;
        this.deptName = deptName;
        this.empId = empId;
        this.location = location;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Location='" + location + '\'' +
                ", deptName='" + deptName + '\'' +
                ", fname='" + fname + '\'' +
                ", lname=" + lname +
                ", empId=" + empId +
                '}';
    }
}
