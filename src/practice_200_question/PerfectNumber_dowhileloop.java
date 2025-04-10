package practice_200_question;

import java.util.Scanner;
public class PerfectNumber_dowhileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int sum = 0;
		int i =0;
		do {
			i++;
			if(n % i ==0) {
				sum = sum + i;
			}
		}
		while(i <= n/2);
		if(sum == n) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not perfect Number");
		}
	}
}
