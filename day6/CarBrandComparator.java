import java.util.Comparator;

class CarBrandComparator implements Comparator<Car> {
	public int compare (Car c1, Car c2) {
		return c1.getName().compareTo(c2.getName());
	}
}