package practice_200_question;

import java.util.Scanner;

public class Greatest_4_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1= s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int n4 = s.nextInt();
		if(n1 >n2 && n1>n3 && n1>n4) {
			System.out.println("N1");
		}
		else if(n2>n1 && n2>n3 && n2>n4) {
			System.out.println("N2");
		}
		else if(n3>n1&&n3>n2&&n3>n4) {
			System.out.println("N3");
		}
		else{
			System.out.println("N4");
		}
	}

}
