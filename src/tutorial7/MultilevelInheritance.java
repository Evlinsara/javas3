package tutorial7;
import java.util.*;
class Vechicle{
    String model;
    int year;
}
class Car extends Vechicle{
    int door;
}
class ElectricCar extends Car{
    String battery;
    void display(){
        System.out.println("Model: "+model);
        System.out.println("Year :"+year);
        System.out.println("Number of doors :"+door);
        System.out.println("Battery Capacity:"+battery);
    }
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        ElectricCar e=new ElectricCar();
        System.out.println("Enter the model of car: ");
        e.model=sc.next();
        System.out.println("Enter year: ");
        e.year=sc.nextInt();
        System.out.println("Enter the number of doors: ");
        e.door=sc.nextInt();
        System.out.println("Enter the battery capacity: ");
        e.battery=sc.next();
        System.out.println("\nCAR DETAILS:");
        e.display();

	}

}
