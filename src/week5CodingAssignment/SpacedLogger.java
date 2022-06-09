package week5CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String L) {
		StringBuilder log = new StringBuilder();
		for (int i = 0; i < L.length(); i++) {
			log.append(L.charAt(i) + " ");
		}
		System.out.println(log.toString());
	}

	@Override
	public void Error(String E) {
		StringBuilder log = new StringBuilder();
		for (int i = 0; i < E.length(); i++) {
			log.append(E.charAt(i) + " ");
		}
		System.out.println("ERROR:" + log.toString());

	}

}
