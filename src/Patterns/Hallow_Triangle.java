package Patterns;

import java.util.Scanner;

public class Hallow_Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==1 || j==2*i-1 || i==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}

	}

}
