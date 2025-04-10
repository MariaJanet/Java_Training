package practice_200_question;

import java.util.Scanner;

public class SumOfAllOddNumbers_Whileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int sum = 0;
		while(i <= n ) {
			System.out.print(i+" ");
			sum = sum + i;
			i=i+2;
		}
		System.out.println();
		System.out.println("Even sum:"+sum);
	}
}
