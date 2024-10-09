package lab;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="y";
		String s2=null;
		Scanner sc=new Scanner(System.in);
		do {
			
		try {
			
			System.out.println("Enter number1:");
			int a1=sc.nextInt();
				System.out.println("Enter number2:");
			int b1=sc.nextInt();
			int div=a1/b1;
			System.out.println("Result:"+div);
			
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("End of Try Block");
			System.out.println("Finally Block Content");
			
		}
		System.out.println("Do you want to continue?(y/n)");
		s2=sc.next();
	}
		while(s1.equals(s2));
		System.out.println("Exiting...");	

}
}
