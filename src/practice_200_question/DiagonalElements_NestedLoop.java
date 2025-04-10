package practice_200_question;

import java.util.Scanner;

public class DiagonalElements_NestedLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int col = s.nextInt();
		int mat[][] = new int[rows][col];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j] = s.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat[i][j] + " ") ;
			}
			System.out.println();
		}

	}

}
