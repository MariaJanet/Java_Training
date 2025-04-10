package practice_200_question;

import java.util.Scanner;

public class Even_number_WhileLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int i=2;
		while(i<=n) {
			
				System.out.println(i);
				i+= 2;
			
		}
	}

}
