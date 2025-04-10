package practice_200_question;

import java.util.Scanner;
public class Fcatorial_Whileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int fact = 1;
		int i =n;
		while(i >1) {
			fact = fact * i;
			i--;
		}
		System.out.println(fact);
	}

}
