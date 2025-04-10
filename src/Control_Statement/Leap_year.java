package Control_Statement;

import java.util.Scanner;

public class Leap_year {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		if((n1 % 4 ==0) || (n1 % 400 ==0)&& (n1 % 100 !=0) ) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("not a leap yr");
		}
		
	}
	

}
