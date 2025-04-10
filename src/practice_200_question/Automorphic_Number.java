package practice_200_question;

import java.util.Scanner;

public class Automorphic_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int sq = n* n;
		while(n >0) {
			if(n % 10 != sq % 10) {
				System.out.println("Not automorphic");
				return;
			}
			sq = sq /10;
			n = n/10;
		}
		if(n==0) {
			System.out.println("Automorphic");
		}

	}

}
