package lab;

public class InvalidAmountException extends Exception 

{

		private String msg;

	InvalidAmountException(String msg) {


		this.msg = msg;


		}



		public String getMessage() {


		return msg;


		}


		}


