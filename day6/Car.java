class Car {
	int regId;
	String brand;
	String color;
	
	public Car (int regId, String brand, String color) {
		this.regId = regId;
		this.brand = brand;
		this.color = color;
	}
	
	public int getRegId () {
		return this.regId;
	}
	public void setRegId (int regId) {
		this.regId = regId;
	}
	public String getName () {
		return this.brand;
	}
	public void setName (String brand) {
		this.brand = brand;
	}
	public String getColor () {
		return this.color;
	}
	public void setColor (String color) {
		this.color = color;
	}
	public String toString() {
		return "ID: " + this.regId + " Brand: " + this.brand + " Color: " + this.color;
	}
}