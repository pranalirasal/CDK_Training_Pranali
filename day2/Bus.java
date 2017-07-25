class Bus extends Automobile {
	String model;
	Bus() {
		System.out.println("In default constructor of Bus...");
	}
	
	Bus(int wheels, long vin, int speed, double price, String model) {
		super (wheels, vin, speed, price);
		this.model = model;
	}

	void accelerate() {
		this.speed += 20;
	}
	public void display(){
		super.display();
		System.out.println("Model: " + this.model);
	}	
}