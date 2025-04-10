package practice_200_question;

import java.util.Scanner;

public class Perfect_Not {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int sum = 0;
		for(int i=1;i<=n/2;i++) {
			if(n%i ==0) {
				sum = sum +i;
			}
		}
		if(sum == n) {
			System.out.println("perfect");
		}
		else {
			System.out.println("Not perfect");
		}
	}

}
