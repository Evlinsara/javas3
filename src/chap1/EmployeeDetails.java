package chap1;
import java.util.*;

class Employee {
String name,address;
int age,phoneNo;
float salary; 
void print_Employee() {
System.out.println("Name is "+name);
System.out.println("Age is "+age);
System.out.println("Phone No is "+phoneNo);
System.out.println("Address is "+address);
}
void print_Salary() {
System.out.println("Salary is "+salary);
}
}
class Officer extends Employee {
String specialization;
void print_specialization() {
System.out.println("Specialization is "+specialization);
}
}
class Manager extends Employee {
String department;
void print_department() {
System.out.println("Department is "+department);
}
}

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Officer ob=new Officer();
		System.out.println("Enter Officer's name:");
		ob.name=sc.nextLine();
		System.out.println("Enter address:");
		ob.address=sc.nextLine();
		System.out.println("Enter specialization:");
		ob.specialization=sc.nextLine();
		System.out.println("Enter Age:");
		ob.age=sc.nextInt();
		System.out.println("Enter Phone number:");
		ob.phoneNo=sc.nextInt();
		System.out.println("Enter Salary:");
		ob.salary=sc.nextInt();
		Manager os=new Manager();
		sc.nextLine();
		System.out.println("Enter Manager's name:");
		os.name=sc.nextLine();

System.out.println("Enter address:");
os.address=sc.nextLine();
System.out.println("Enter department:");
os.department=sc.nextLine();
System.out.println("Enter Age:");
os.age=sc.nextInt();
System.out.println("Enter Phone number:");
os.phoneNo=sc.nextInt();
System.out.println("Enter Salary:");
os.salary=sc.nextInt();
sc.nextLine();
System.out.println("Officer's Details\n");
ob.print_Employee();
ob.print_Salary();
ob.print_specialization();
sc.nextLine();
System.out.println("Manager's Details\n");
os.print_Employee();
os.print_Salary();
os.print_department();
sc.close();
	}

}
