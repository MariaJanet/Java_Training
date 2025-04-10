package Assessment_Prep;

import java.util.Scanner;

public class SPY_number {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n= s.nextInt();
		int temp=n;
		int sum=0,prod = 1;
		while(n>0) {
			int d = n%10;
			sum = sum +d;
			n = n/10;
		}
		System.out.println(sum);
		n=temp;
		while(n>0) {
			int d = n % 10;
			prod = prod * d;
			n = n/ 10;
		}
		System.out.println(prod);
		if(sum == prod) {
			System.out.println("SPY number");
		}
		else {
			System.out.println("Not");
		}

	}

}
