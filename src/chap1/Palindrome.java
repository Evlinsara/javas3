package chap1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String str=sc.nextLine();
		sc.close();
		String rev= "";
		int l= str.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("New String: "+rev);
		if(str.equals(rev))
		{
		System.out.println(str +" is Palindrome");
		}
		else { 
		System.out.println(str +" is not palindrome");
	
		}

	}
}



