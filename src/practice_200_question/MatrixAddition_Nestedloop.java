package practice_200_question;

import java.util.Scanner;

public class MatrixAddition_Nestedloop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int col = s.nextInt();
		int [][]mat1 = new int[rows][col];
		int [][]mat2 = new int[rows][col];
		int [][]sum = new int[rows][col];
		for(int i = 0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				mat1[i][j] = s.nextInt();
			}
		}
		for(int i = 0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				mat2[i][j] = s.nextInt();
			}
		}
		for(int i = 0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				sum[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}	
	}
}
