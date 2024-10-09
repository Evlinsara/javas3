package chap1;
import java.util.*;

public class OverloadExample {
	public int sum(int a,int b) {
		return a+b;
	}
	public String sum(String x,String y) {
		return x+y;
	}
	
	public int sum(int a) {
		return a+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		OverloadExample ex=new OverloadExample();
		System.out.print("Enter first integer:");
		int n1=scanner.nextInt();
		System.out.print("Enter second integer:");
		int n2=scanner.nextInt();
		int intResult=ex.sum(n1,n2);
		System.out.print("Sum of integers:"+intResult);
		scanner.nextLine();
		System.out.print("\nEnter first string:");
		String s1=scanner.nextLine();
		System.out.print("Enter second string:");
		String s2=scanner.nextLine();
		String stringResult=ex.sum(s1,s2);
		System.out.print("Concatenated string:"+stringResult);
		scanner.close();
		
		

	}

}
