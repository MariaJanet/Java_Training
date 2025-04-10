package Assessment_Prep;

import java.util.Scanner;

public class AmicableNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1= s.nextInt();
		int n2 = s.nextInt();
		int sum1=0,sum2=0;
		for(int i=1;i<n1;i++) {
			if(n1 % i==0) {
				sum1 = sum1+i;
			}
		}
		for(int i=1;i<n2;i++) {
			if(n2 % i==0) {
				sum2 = sum2+i;
			}
		}
		if(sum1 == n2 && sum2 == n1) {
			System.out.println("Ambical Number");
		}
		else {
			System.out.println("Not");
		}

	}

}
