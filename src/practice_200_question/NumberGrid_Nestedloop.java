package practice_200_question;

import java.util.Scanner;
public class NumberGrid_Nestedloop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int col = s.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
