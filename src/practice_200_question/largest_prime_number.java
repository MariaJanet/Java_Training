package practice_200_question;

import java.util.Scanner;

public class largest_prime_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int num = n;
		while(num >= 2) {
			int i=2;
			while(i <= num/2) {
				if(num % i ==0) {
					break;
				}
				i++;
			}
			while(i > num/2) {
				System.out.println(num);
				break;
			}
			num--;		
		}
	}
}
