import java.io.Serializable;

class Employee implements Serializable{
	private int empId;
	private String empName;
	transient double salary;
	
	public Employee (int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	int getEmpId() {
		return this.empId;
	}
	String getEmpName () {
		return this.empName;
	}
	
	double getSalary () {
		return this.salary;
	}
}