class Shape {
	public static void main(String[] args){
		Shape shape = new Shape();
		shape.paint("Rectangle", 20.00);
		shape.paint("HB");
		shape.paint("Red", 5);
	}
	public void paint(String Shape, double brushSize) {
		System.out.println("Brush Paint...");
	}

	public void paint(String thickness) {
		System.out.println("Pencil Paint...");

	}
	
	public void paint(String color, int numberOfFingers) {
		System.out.println("Finger Paint...");

	}
}