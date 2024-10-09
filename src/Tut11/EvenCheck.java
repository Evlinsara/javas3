package Tut11;
import pack2.Even;
import java.util.*;

public class EvenCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int a=Even.checkNum(num);
		if(a==1) {
			System.out.println("Number "+num+" is even");
		
		}
		else {
			System.out.println("Number "+num+" is not even");
		}
		sc.close();
	}

}
