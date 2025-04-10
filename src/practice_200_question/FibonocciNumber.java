package practice_200_question;

import java.util.Scanner;

public class FibonocciNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int sq1 =(int) Math.sqrt(5 *n*n+4);
		int sq2 =(int) Math.sqrt(5 *n*n-4);
		if((sq1 * sq1 == (5 *n*n+4)) || (sq2 * sq2 == (5 *n *n-4))) {
			System.out.println("Fibonocci");
		}
		else {
			System.out.println("Not");
		}

	}

}
