package practice_200_question;
import java.util.*;
public class ReverseANumber_DowhileLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int rev = 0;
		do {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n/10;
		}
		while(n > 0);
		System.out.println(rev);
	}
}
