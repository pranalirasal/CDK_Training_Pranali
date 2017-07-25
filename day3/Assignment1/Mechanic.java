/*Create a class Vehicle which will have 3 methods and some properties along with
2 contructors
1) */

abstract class Vehicle {
	int vin;
	String model;
	
	Vehicle() {
		System.out.println("You are in default constructor of Vehicle class...");
	}

	Vehicle(int vin, String model){
		this.vin = vin;
		this.model = model;
	}
	void details(){
		System.out.println("Vehicle identification number: " + this.vin);
		System.out.println("Name of the model: " + this.model);
	}
	abstract void drive();
	abstract void inspect();
}

class Bike extends Vehicle {
	int handle; //radius by which it turns

	Bike(int handle, int vin, String model) {
		super(vin, model);
		this.handle = handle;
	}
	void details() {
		super.details();
		System.out.println("Handle turned: " + this.handle);
	}
	void drive() {
		System.out.println("Driving Bike...");
	}	
	void inspect() {
		System.out.println("Inspecting bike...All good!");
	}
}

class Car extends Vehicle {
	int steeringPower;

	Car(int steeringPower, int vin, String model) {
		super(vin, model);
		this.steeringPower = steeringPower;
	}
	void details() {
		super.details();
		System.out.println("Number of seats for a bike: " + this.steeringPower);
	}
	void drive() {
		System.out.println("Driving Car...");
	}	
	void inspect() {
		System.out.println("Inspecting car...All good!");
	}
}

class Mechanic {
	public static void main(String[] args) {
		Car car = new Car (200, 2343482, "Jaguar");
		car.drive();
		car.inspect();
		car.details();

		Bike bike = new Bike (30, 21234, "Splendor");
		bike.drive();
		bike.inspect();
		bike.details();
	}
}