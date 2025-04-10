package practice_200_question;

import java.util.Scanner;

public class PrimeNmber_Whileloop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=2;
		int count = 0;
		if(n <=1) {
			count = 2;
		}
		else {
			while(i *i <=n) {
				if(n %i ==0) {
					count++;
					break;
				}
				i++;
			}			
		}
		if(count == 0) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
	}
}
