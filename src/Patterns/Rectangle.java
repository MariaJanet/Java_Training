package Patterns;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int r= s.nextInt();
		int c = s.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i==1 || i==r || j==1||j==c) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				//System.out.print("* ");
			}
			System.out.println();
		}

	}

}
