class CalculatorDemo {
	public static void main (String[] args) {
		Calculator.start (10, 20, (int number1, int number2) -> {
			System.out.printf ("Addition is: %s%n", (number1 + number2));
		});
		
		Calculator.start (20, 10, (int number1, int number2) -> {
			System.out.printf ("Subtraction is: %s%n", (number1 - number1));
		});
		
		Calculator.start (5, 7, (int number1, int number2) -> {
			System.out.printf ("Multiplication is: %s%n", (number1 * number2));
		});
		
		Calculator.start (90, 10, (int number1, int number2) -> {
			System.out.printf ("Division is: %s%n", (number1 / number2));
		});
	}
}