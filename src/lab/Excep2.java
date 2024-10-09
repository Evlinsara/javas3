package lab;
import java.util.*;

public class Excep2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
		
			System.out.println("Enter the number of elements you want to store:");
			int n=sc.nextInt();
			int[] a=new int[n];
			System.out.println("Enter elements in array:");
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("Array length: "+n);
			System.out.println("Enter position of element to be accessed:");
			int s=sc.nextInt();
			System.out.println("Element is: "+a[s]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is out of bound");
		}
		
	}
}
