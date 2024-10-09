package chap1;

import java.util.*;

class Box{
	int w,d,h;
	int volume(int w,int d,int h) {
		
		System.out.print("w="+w+",d="+d+",h="+h);
		return(w*d*h);
		
	}
}

public class DEmo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter height, width, depth:");
		Scanner sc=new Scanner(System.in);
		Box b1=new Box();
		int h=sc.nextInt();
		int w=sc.nextInt();
		int d=sc.nextInt();
		int vol=b1.volume(h,w,d);
		System.out.print(vol);
       
        
	}

}
