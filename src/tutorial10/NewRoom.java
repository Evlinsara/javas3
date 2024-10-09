package tutorial10;
import java.util.*;

public class NewRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Slot number:");
		int slot=sc.nextInt();
		try {
			if(slot<=0) {
				throw new InvalidRervExcep("Invalid number...");
			}
			else {
				System.out.println("Slot registered");
			}
		}
		catch(InvalidRervExcep e) {
			System.out.println(e.getMessage());
		}
	}

}
