package practice_200_question;
import java.util.*;
public class Largest_3_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1= s.nextInt();
		int n2=s.nextInt();
		int n3 = s.nextInt();
		if(n1 >n2 && n1>n3) {
			System.out.println("N1");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("N2");
		}
		else {
			System.out.println("N3");
		}
		

	}

}
