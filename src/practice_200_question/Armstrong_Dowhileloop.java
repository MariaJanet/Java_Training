package practice_200_question;
import java.util.*;
public class Armstrong_Dowhileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = n;
		int sum = 0;
		int digits = 0;
		int num = n;
		do {
			digits++;
			num = num / 10;
		}
		while(num > 0);
		num = n;
		do {
			int digit = num % 10;
			sum += Math.pow(digit, digits);
			num = num / 10;
		}
		while(num > 0);
		if(sum == temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not armstrog");
		}
	}
}
