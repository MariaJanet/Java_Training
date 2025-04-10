package practice_200_question;

import java.util.Scanner;

public class odd_numbers_whileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int i=1;
		while(i<=n) {
			
				System.out.println(i);
				i+= 2;
			
		}
	}

}
