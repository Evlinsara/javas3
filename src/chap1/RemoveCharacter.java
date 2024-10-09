package chap1;
import java.util.*;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		System.out.println("Enter character to be removed:");
		char letter=sc.nextLine().charAt(0);
		String result=str.replace(letter,'\0').replaceAll("\0", " ");
		System.out.println("New string is:"+result);
	}

}
