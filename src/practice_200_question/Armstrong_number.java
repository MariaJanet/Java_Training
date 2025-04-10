package practice_200_question;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int temp = n;
		int sum =0;
		int digits = 0;
		int num = n;
		while(num >0) {
			num = num /10;
			digits++;
		}
		num = n;
		while(num >0) {
			int digit = num % 10;
			sum += Math.pow(digit, digits);
			num = num /10;
		}
		if(sum == temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not armstrog");
		}

	}

}
