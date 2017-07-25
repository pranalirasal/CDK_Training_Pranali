class Driver {
	public static void main(String[] args) {
		Car BMW = new Car();
		BMW.start();
		System.out.println(BMW.speed);
		BMW.accelerate(40);
		System.out.println(BMW.speed);
		BMW.brake(20);
		System.out.println(BMW.speed);
		BMW.changeGear('1');
		BMW.reverse();
	}
}