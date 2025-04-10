package practice_200_question;

import java.util.Scanner;
public class Reverseastring_dowhileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str= s.next();
		String str1 = "";
		int i = str.length()-1;
		do {
			str1 = str1 + str.charAt(i);
			i--;
		}
		while(i >=0);
		System.out.println(str1);
	}
}
