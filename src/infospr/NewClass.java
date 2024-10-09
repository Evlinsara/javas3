package infospr;
public class NewClass {
	  private double balance = 500.00;  
	  public double getBalance(int accountId) { 
	    // logic here
	    return balance;
	  }
	 
	 

	 public static void main(String[] args) {    
		    NewClass accnt = new NewClass();          
		    double value = accnt.getBalance(123456);  
		    System.out.println("The balance is: " + value);
		  }
		}



