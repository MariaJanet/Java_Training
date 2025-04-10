package practice_200_question;

import java.util.Scanner;
public class SumOfSquareOfNumberInRange_Dowhileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int i=1;
		int sum = 0;
		do {
			int sq = i*i;
			System.out.println(sq + " ");
			sum = sum +sq;
			i++;
		}
		while(i <= n);
		System.out.println("Sum:" + sum);
	}
}
