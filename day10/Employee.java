/**
 * Created by rasalp on 7/29/2017.
 */
public class Employee {
    int empid;
    double salary;

    public Employee(int empid, double salary) {
        this.empid = empid;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
