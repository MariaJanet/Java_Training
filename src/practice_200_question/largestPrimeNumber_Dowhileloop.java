package practice_200_question;

import java.util.Scanner;

public class largestPrimeNumber_Dowhileloop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int max = 0;
		int i =1;
		do {
			int count = 0;
			for(int j=1;j<i;j++) {
				if(i % j ==0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i+" ");
				if(max < i) {
					max = i;
				}
			}
		}
		while(i<=n);
		System.out.println(max);
		
	}

}
