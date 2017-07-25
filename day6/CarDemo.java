import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

class CarDemo {
	public static void main(String[] args){
		//Set <Car> cars = new TreeSet<>(new CarIdComparator());
		Set<Car> cars = new TreeSet<> (new CarBrandComparator());
		Car car = new Car (101, "BMW", "Black");
		Car car1 = new Car (102, "Audi", "White");
		Car car2 = new Car (103, "Lamborghini", "Yellow");
		Car car3 = new Car (543, "Jaguar", "Red");
		Car car4 = new Car (345, "Alto", "Grey");
		Car car5 = new Car (234, "Polo", "Light Green");
		Car car6 = new Car (123, "BMW", "Black");
		Car car7 = new Car (178, "Audi", "White");
		Car car8 = new Car (124, "Lamborghini", "Yellow");
		Car car9 = new Car (567, "Jaguar", "Red");
		Car car10 = new Car (385, "Alto", "Grey");
		Car car11 = new Car (204, "Polo", "Light Green");
		Car car12 = new Car (109, "BMW", "Black");
		Car car13 = new Car (108, "Audi", "White");
		Car car14 = new Car (105, "Lamborghini", "Yellow");
		Car car15 = new Car (544, "Jaguar", "Red");
		Car car16 = new Car (305, "Alto", "Grey");
		Car car17 = new Car (284, "Polo", "Light Green");
		Car car18 = new Car (675, "BMW", "Black");
		Car car19 = new Car (156, "Audi", "White");
		
		cars.add(car);
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		cars.add(car8);
		cars.add(car9);
		cars.add(car10);
		cars.add(car11);
		cars.add(car12);
		cars.add(car13);
		cars.add(car14);
		cars.add(car15);
		cars.add(car16);
		cars.add(car17);
		cars.add(car18);
		cars.add(car19);
		
		Iterator<Car> iterator = cars.iterator();
		
		while (iterator.hasNext()) {
			Car c = iterator.next();
			System.out.println(c);
		}
	}
}