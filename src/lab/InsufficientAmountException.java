package lab;


public class InsufficientAmountException extends Exception 

{

	private String msg;

	InsufficientAmountException (String msg) {


	this.msg = msg;


	}



	public String getMessage() {


	return msg;


	}


	}