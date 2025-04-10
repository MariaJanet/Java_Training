package practice_200_question;

import java.util.Scanner;
public class sum_of_natural_numbers_whileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int sum =0;
		int i =1;
		while(i <= n) {
			sum = sum +i;
			i++;
		}
		System.out.println(sum);
	}
}
