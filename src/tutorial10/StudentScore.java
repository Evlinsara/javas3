package tutorial10;
import java.util.*;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score: ");
		int score=sc.nextInt();
		try {
			if(score<0||score>100) {
				throw new InvalidScoreExcep("The score must be between 0 and 100");
			}
			else {
				System.out.println("The score is: "+score);
			}
		}
		catch(InvalidScoreExcep e) {
			System.out.println(e.getMessage());
		}
	}

}
