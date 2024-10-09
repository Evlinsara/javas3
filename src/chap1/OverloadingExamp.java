package chap1;
import java.util.Scanner;

public class OverloadingExamp 
     {
	void area(float base,float height) {
	float area=0.5f*base*height;
	System.out.println("Area of triangle is "+area);
       }
    void area(int width,int height)
    {
	int area=width*height;
	System.out.println("Area of rectangle is "+area);
         }
    void area(int radius)  {
    	double area=3.14*radius*radius;
    	System.out.println("Area of circle is "+area);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		OverloadingExamp obj=new OverloadingExamp();
		float b,h;
		System.out.println("Enter base of triangle:");
		b=sc.nextFloat();
		System.out.println("Enter height of triangle:");
		h=sc.nextFloat();
		int w,he;
		System.out.println("Enter width of rectangle:");
		w=sc.nextInt();
		System.out.println("Enter height of rectangle:");
		he=sc.nextInt();
		int r;
		System.out.println("Enter radius of circle:");
		r=sc.nextInt();
		obj.area(b,h);
		obj.area(w,he);
		obj.area(r);
	}

}
