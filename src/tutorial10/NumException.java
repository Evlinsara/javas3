package tutorial10;
import java.util.*;

public class NumException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int[] A=new int[n];
		int sum=0,c=0;
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
			
		}
		System.out.println("The numbers are:");
		for(int i=0;i<n;i++) {
			try {
				if(A[i]>0) {
					System.out.println(A[i]);
					sum=sum+A[i];
					c++;
						
				}
				else {
					throw new InvalidException1("Invalid number "+A[i]);
				} }
				catch(InvalidException1 e) {
					System.out.println(e.getMessage());
				}
			}
			if(c>0) {
				System.out.println("The sum of positive number number is "+sum);
				float avg=sum/c;
				System.out.println("The average is:"+avg);
			}
		}

	}


