package practice_200_question;
import java.util.*;
public class FcatorialOfNUmber_Dowhileloop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int fact =1;
		int i=n;
		do {			
			fact = fact *i;
			i--;
		}
		while(i > 0);
		System.out.println("Factorial :" + fact);
	}
}
