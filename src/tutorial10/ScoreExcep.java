package tutorial10;

public class InvalidScoreExcep extends Exception {
	private String message;
	InvalidScoreExcep(String msg) {
		message=msg;
	}
	public String getMessage() {
		return message;
	}
}

