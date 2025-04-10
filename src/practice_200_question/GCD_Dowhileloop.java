package practice_200_question;

import java.util.Scanner;
public class GCD_Dowhileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
		int n1= s.nextInt();   
		int n2 = s.nextInt();
		int i = 0;
		do {
			int temp = n2;
			n2 = n1 % n2;
			n1 = temp;
		}
		while(n2 != 0 );
		System.out.println(n1);
	}
}
