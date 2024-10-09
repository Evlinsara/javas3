package tutorial10;

public class InvalidException1 extends Exception{
	private String message;
	public InvalidException1(String msg) {
		message=msg;
		}
	public String getMessage() {
		return message;
	}
}


