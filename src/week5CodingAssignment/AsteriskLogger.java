package week5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log (String L) {
		System.out.println("***"+ L + "***");

	}

	@Override
	public void Error(String E) {
		System.out.println("*******************");
		System.out.println("***Error:"+ E +"***");
		System.out.println("*******************");

	}

}
