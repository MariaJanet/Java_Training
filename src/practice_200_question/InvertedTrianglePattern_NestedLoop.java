package practice_200_question;

import java.util.Scanner;
public class InvertedTrianglePattern_NestedLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = n ;i>=1;i--) {
			for(int k=1;k<=n-i;k++) {
				System.out.print("  ");
			}
			for(int j = 1;j<=(2*i)-1;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}

	}

}
