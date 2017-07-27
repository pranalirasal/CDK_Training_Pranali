import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class EmployeeDemo {
	public static void main (String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		Employee e1 = new Employee (101, "XYZ", 50000);
		Employee e2 = new Employee (102, "ABC", 45000);
		Employee e3 = new Employee (103, "GHI", 5000);
		Employee e4 = new Employee (104, "JKL", 4000);
		Employee e5 = new Employee (105, "MNO", 60000);
		Employee e6 = new Employee (106, "PQR", 30000);
		Employee e7 = new Employee (107, "STU", 90000);
		Employee e8 = new Employee (108, "VWX", 10000);
		Employee e9 = new Employee (109, "YZA", 20000);
		Employee e10 = new Employee (110, "BCD", 55000);
		Employee e11 = new Employee (111, "EFG", 30000);
		Employee e12 = new Employee (112, "HIJ", 35000);
		Employee e13 = new Employee (113, "KLM", 40000);
		Employee e14 = new Employee (114, "NOP", 85000);
		Employee e15 = new Employee (115, "QRS", 10000);
		Employee e16 = new Employee (116, "TUV", 45000);
		Employee e17 = new Employee (117, "WXY", 70000);
		Employee e18 = new Employee (118, "ZAB", 25000);
		
		List <Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10);
		employees.add(e11);
		employees.add(e12);
		employees.add(e13);
		employees.add(e14);
		employees.add(e15);
		employees.add(e16);
		employees.add(e17);
		employees.add(e18);
		
		TreeSet <Employee> set = new TreeSet <> (new EmployeeSalaryComparator());
		
		Iterator<Employee> iterator = employees.iterator();
		Employee employee = null;
		while (iterator.hasNext()) {
			employee = iterator.next();
			if (employee.getSalary() >= 40000)
				set.add (employee);
		}
		
		writeObjectToFile (set);
		readObjectToFile (set);
	}
	
	public static void writeObjectToFile (TreeSet set) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try{
			fos = new FileOutputStream("C:/Assignments/day8/Assignment 3/employees.txt");
			oos = new ObjectOutputStream(fos);
			
			Employee employee = null;
			Iterator itr = set.iterator();
			
			while (itr.hasNext()) {
				employee = (Employee)itr.next();
				oos.writeObject(employee);
			}
			System.out.println("Done");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(oos != null){
					oos.close();
				}
				if(fos != null){
					fos.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	public static void readObjectToFile (TreeSet set) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Set<Employee> employees = new TreeSet<>(set);
		Iterator<Employee> itr = employees.iterator();
		try{
			fis = new FileInputStream("C:/Assignments/day8/Assignment 3/employees.txt");
			ois = new ObjectInputStream(fis);
			Employee e = (Employee)ois.readObject();
			
			while (e != null) {
				e = (Employee)ois.readObject();
				System.out.print(e.getEmpId() + " ");
				System.out.print(e.getEmpName() + " ");
				System.out.println(e.salary);
			}
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(ois != null){
					ois.close();
				}
				if(fis != null){
					fis.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}