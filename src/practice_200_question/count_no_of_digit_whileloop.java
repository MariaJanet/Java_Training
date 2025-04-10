package practice_200_question;

import java.util.Scanner;
public class count_no_of_digit_whileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int count =0;
		int i = n;
		while(i >0) {
			count++;
			i = i/10;
		}
		System.out.println(count);
	}
}
