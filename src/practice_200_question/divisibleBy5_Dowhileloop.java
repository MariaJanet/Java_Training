package practice_200_question;

import java.util.Scanner;
public class divisibleBy5_Dowhileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min= s.nextInt();
		int max = s.nextInt();
		int num = (min % 5 == 0) ? min : (min + (5 - min % 5));
		do {
			if(num > max) break;
			System.out.println(num);
			num = num +5;		
		}
		while(num <= max);
		System.out.println();
	}
}
