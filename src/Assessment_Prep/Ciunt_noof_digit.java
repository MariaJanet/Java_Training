package Assessment_Prep;

import java.util.Scanner;

public class Ciunt_noof_digit {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n= s.nextInt();
		int count =0;
		while(n>0) {
			n = n/10;
			count++;
		}
		System.out.println(count);

	}

}
