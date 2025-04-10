package practice_200_question;

import java.util.Scanner;

public class Factorial_Recursion {
	public static int factorial(int number) {
		if(number == 0) {
			return 1;
		}
		return number * factorial(number-1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		System.out.println("Factorial:" + factorial(n));

	}
}
