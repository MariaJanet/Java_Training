package practice_200_question;

import java.util.Scanner;
public class primeNumbers_NestedLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		for(int num = start;num<=end;num++) {
			int count = 0;
			if(num > 1) {
				for(int i = 2;i<=Math.sqrt(num);i++) {
					if(num % i ==0) {
						count++;
						break;
					}		
				}
				if(count == 0) {
					System.out.println(num);
				}
			}		
		}
	}
}
