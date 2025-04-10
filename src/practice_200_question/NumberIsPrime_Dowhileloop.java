package practice_200_question;
import java.util.*;
public class NumberIsPrime_Dowhileloop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int count = 0;
		int i=2;
		do {
			if(n % i == 0) {
				count++;
				break;
			}
			i++;
		}
		while(n <= n/2);
		if(count == 0) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
	}

}
