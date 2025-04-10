package Control_Statement;

import java.util.Scanner;

public class Divisible_by_3_an_5 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		if(n1 %3 == 0 && n1%5==0) {
			System.out.println("Divisible");
		}
		else{
		System.out.println("Not divisible");
		}
		
		
	}

}
