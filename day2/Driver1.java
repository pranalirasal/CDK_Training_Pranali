class Driver1 {
	public static void main(String[] args) {
		FlyingCar flyingCar = new FlyingCar(2, 20, "google", 4, 1234556, 200, 1000000.00);
		flyingCar.display();
		SportsCar  sportsCar = new SportsCar(20, "Ferrari", 4, 3245522, 150, 89999999.00);
		sportsCar.display();
	}
}