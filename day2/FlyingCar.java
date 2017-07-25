class FlyingCar extends Car {
	int height;
	int numberOfWings;
	
	FlyingCar(int numberOfWings, int height, String carName, int wheels, long vin, int speed, double price) {
		super(carName, wheels, vin, speed, price);
		this.numberOfWings = numberOfWings;
		this.height = height;
	}

	public void display(){
		super.display();
		System.out.println("Number of wings: "+ numberOfWings);
		System.out.println("Height: " + this.height);
	}
}