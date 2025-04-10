package practice_200_question;

import java.util.Scanner;

public class Vowel_Or_Consonant {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
		

	}

}
