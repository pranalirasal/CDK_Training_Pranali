public class Process {
	public static void main (String[] args) {
		processEntry();
	}
	@TimeStamp (day = Day.MON, month = Month.JUL, year = Year.SEVENTEEN)
	public static void processEntry () {
		System.out.println("Annotation Demo at method and class level.");
	}
}