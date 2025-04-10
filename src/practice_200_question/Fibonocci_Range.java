package practice_200_question;

import java.util.Scanner;

public class Fibonocci_Range {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int f_num = 0;
		int s_num = 1;
		for(int i=1;i<=n;i++) {
			System.out.print(f_num + " ");
			int n_num = f_num + s_num;
			f_num = s_num;
			s_num = n_num;
		}
	}
}
