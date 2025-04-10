package practice_200_question;
import java.util.*;
public class fibonocciseriesutoN_dowhileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int f_num = 0;
		int s_num = 1;
		do {
			System.out.println(f_num);
			int n_trm = f_num +s_num;
			f_num = s_num;
			s_num =n_trm; 			
		}
		while(f_num <= n);
	}
}
