package practice_200_question;
import java.util.*;
public class CountNoOfDigit_dowhileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int i =n;
		int count = 0;
		do {
			count++;
			i = i / 10;			
		}
		while(i > 0);
		System.out.println(count);
	}
}
