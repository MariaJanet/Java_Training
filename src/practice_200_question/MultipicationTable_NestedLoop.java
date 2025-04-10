package practice_200_question;

import java.util.Scanner;
public class MultipicationTable_NestedLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print(j + "x" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}
}
