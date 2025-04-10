package practice_200_question;
import java.util.*;
public class GCD_whileloop {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		while(n2 !=0) {
			int temp = n2;
			n2 = n1 % n2;
			n1 = temp;
		}
		System.out.println(n1);
	}
}
