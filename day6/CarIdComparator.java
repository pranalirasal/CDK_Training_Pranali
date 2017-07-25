import java.util.Comparator;

class CarIdComparator implements Comparator<Car> {
	public int compare (Car c1, Car c2) {
		return c1.getRegId() - c2.getRegId();
	}
}