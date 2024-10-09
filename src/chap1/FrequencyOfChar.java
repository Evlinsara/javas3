package chap1;

import java.util.Scanner;

public class FrequencyOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A string:");
		String str=sc.nextLine();
		System.out.print("\nEnter A Character:");
		int index;
		char c=sc.next().charAt(index=0);
		int len=str.length();
		int count=0;
		for(int i=0;i<len;i++) {
			if(str.charAt(i)==c) {
				count++;
			}
		}
		System.out.println("Number of occurence is "+count);
		sc.close();
		

	}

}
