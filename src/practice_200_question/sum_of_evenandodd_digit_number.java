package practice_200_question;

import java.util.Scanner;
public class sum_of_evenandodd_digit_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =n;
		int even = 0;
		int odd=0;
		while(n >0) {
			int digit = n % 10;
			if(n % 2==0) {
				even  =even+digit;
			}
			else {
				odd = odd + digit;
			}
			n = n/10;
		}
		System.out.println("even:" + even);
		System.out.println("odd:"+odd);
	}
}
