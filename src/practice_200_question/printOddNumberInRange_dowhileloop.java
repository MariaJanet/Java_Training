package practice_200_question;
import java.util.*;
public class printOddNumberInRange_dowhileloop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		do {
			System.out.println(i);
			i = i+2;
		}
		while(i <= n);
	}
}
