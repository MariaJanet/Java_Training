package Control_Statement;

import java.util.Scanner;

public class Largest_3num {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		if(n1 >n2 && n1>n3) {
			System.out.println("N1 largest");
		}
		else if(n2>n1 && n2>n3) {
		System.out.println("N2 Largest");
		}
		else {
			System.out.println("n3 is largest");
		}
		
	}

}
