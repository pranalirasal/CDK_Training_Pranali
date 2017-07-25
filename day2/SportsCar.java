class SportsCar extends Car {
	int clearance;

	SportsCar(int clearance, String carName, int wheels, long vin, int speed, double price) {
		super(carName, wheels, vin, speed, price);
		this.clearance = clearance;
	}	

	public void display(){
		super.display();
		System.out.println("Clearance: " + this.clearance);
	}
}