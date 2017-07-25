class Car extends Automobile {
	String carName;
	char gear;

	Car (String carName, int wheels, long vin, int speed, double price){
		super(wheels, vin, speed, price);
		this.carName = carName;
	}
	public void changeGear(char gear) {
		this.gear = gear;
	}
}