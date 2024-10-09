package tutorial10;
public class InvalidRervExcep extends Exception {
	private String message;
	public InvalidRervExcep(String msg) {
		message=msg;
	}
	public String getMessage() {
		return message;
	}
}


