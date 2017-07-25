import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class Employee {
	public static void main (String[] args) {
		List <Double> employees = new ArrayList<>();
		
		employees.add (100000.00);
		employees.add (104000.00);
		employees.add (600000.00);
		employees.add (900000.00);
		employees.add (800000.00);
		employees.add (300000.00);
		employees.add (706000.00);
		employees.add (208500.00);
		employees.add (104000.00);
		employees.add (905000.00);
		
		ListIterator list = employees.listIterator();
		double salary = 0.0;
		double hra = 0.0;
		while (list.hasNext()) {
			salary = (Double)list.next();
			hra = salary * (0.3);
			System.out.println(hra);
		}
	}
}