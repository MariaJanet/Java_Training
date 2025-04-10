package practice_200_question;

import java.util.Scanner;
public class FibonociiUptoToRange_Dowhileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int f_num = 0;
		int s_num = 1;
		do {
			System.out.println(f_num);
			int n_num = f_num + s_num;
			f_num = s_num;
			s_num = n_num;
		}
		while(f_num <= n);
	}
}
