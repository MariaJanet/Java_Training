package practice_200_question;
import java.util.*;
public class divisible_by_3_and_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		if(n%3==0 && n%5==0) {
			System.out.println("Both");
		}
		else {
			System.out.println("Not");
		}

	}

}
