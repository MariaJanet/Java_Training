package practice_200_question;

import java.util.Scanner;

public class Sum_of_digit_whileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int sum =0;
		int i =n;
		while(i > 0 ) {
			sum = (i%10) + sum;
			i = i /10;
		}
		System.out.println(sum);
	}
}
