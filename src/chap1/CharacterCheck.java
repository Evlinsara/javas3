package chap1;
import java.util.*;

public class CharacterCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String c1=str.substring(0,1);
		int len=str.length();
		String c2=str.substring(len-1);
		boolean res=c1.equals(c2);
		String str2=str.substring(1,len-1);
		if (res==true) {
			System.out.println(str2);
			System.out.println("Same Characters Found");
			return;
		}
		else {
			System.out.println(str2);
			System.out.println("Same Characters not Found");
			return;
		}
		

	}

}
