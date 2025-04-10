package practice_200_question;

import java.util.Scanner;
public class product_of_digit_whileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int prod = 1;
		int i = n;
		while(i >0) {
			prod = (i%10) * prod;
			i = i/10;
		}
		System.out.println(prod);
	}

}
