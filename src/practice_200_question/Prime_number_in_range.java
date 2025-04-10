package practice_200_question;
import java.util.*;
public class Prime_number_in_range {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int num=2;
		while(num <= n) {
			int i=2;
			while(i <= num/2) {
				if(num % i == 0) {
					break;
				}
				i++;
			}
			if(i > num/2) {
				System.out.println(num);
				
			}
			num++;
		}
	}
}
