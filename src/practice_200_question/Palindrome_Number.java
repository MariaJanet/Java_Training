package practice_200_question;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int a = n;
		int rev =0;
		//int d;
		while(n>0) {
			int d = n % 10;
			rev = rev * 10 +d;
			n = n /10;
			
		}
		if(a == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not");
		}
	}

}
