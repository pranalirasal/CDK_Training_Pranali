class Automobile {
	int wheels;
	long vin;
	int speed;
	double price;

	Automobile(int wheels, long vin, int speed, double price) {
		this.wheels = wheels;
		this.vin = vin;
		this.speed = speed;
		this.price = price;
	}

	void accelerate() {
		this.speed += 10;
	}
	void brake() {
		this.speed -= 10;
	}
	void start() {
		System.out.println("Started...");
	}
	void speed() {
		this.speed = 0;
		System.out.println("Stopped...");
	}
	public void display(){
		System.out.println("Vehicle Registration Number: " + this.vin);
		System.out.println("Number of wheels: " + this.wheels);
		System.out.println("Speed: " + this.speed);
		System.out.println("Price: " + this.price);
	}
}