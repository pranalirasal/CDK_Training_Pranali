import java.util.Comparator;

class EmployeeIdComparator implements Comparator <Employee>{
	public int compare (Employee e1, Employee e2) {
		if (e1 != null && e2 != null)
			return e1.getEmpId() - e2.getEmpId();
		return 0;
	}
}