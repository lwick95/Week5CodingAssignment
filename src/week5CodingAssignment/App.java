package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		Logger asterisk = new AsteriskLogger();
		Logger spaced = new SpacedLogger();
		
		asterisk.Log("Hello");
		asterisk.Error("GoodBye");
		
		spaced.Log("Hello");
		spaced.Error("GoodBye");

	}

}
