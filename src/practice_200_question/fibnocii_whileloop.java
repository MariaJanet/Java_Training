package practice_200_question;

import java.util.Scanner;
public class fibnocii_whileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int f_num = 0;
		int s_num = 1;
		int count = 0;
		while(count <n) {
			System.out.println(f_num);
			int nxt_trm = f_num +s_num;
			f_num = s_num;
			s_num = nxt_trm;
			count++;
		}
	}

}
