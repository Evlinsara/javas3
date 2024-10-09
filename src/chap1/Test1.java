package chap1;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String c1=str.substring(0,2);
		int len=str.length();
		String c2=str.substring(len-2);
		boolean res=c1.equals(c2);
		if(res==true) {
			System.out.println("The character "+c1+" appears at the end of the string");
		}
		else {
			System.out.println("The characters "+c2+" does not appear at the end of this string");
		}
		

	}

}
