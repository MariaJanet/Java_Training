package practice_200_question;
import java.util.*;
public class sumofalldigit_dowhileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int sum = 0;
		do {
			sum = sum + n% 10;
			n = n /10;
		}
		while(n > 0);
		System.out.println(sum);
	}
}
