import java.util.Comparator;

class EmployeeSalaryComparator implements Comparator<Employee>{
	public int compare (Employee e1, Employee e2) {
		if (e1 != null && e2 != null)
			if (e2.getSalary() > e1.getSalary())
				return 1;
			else if (e2.getSalary() < e1.getSalary())
				return -1;
		return 0;
	}
}