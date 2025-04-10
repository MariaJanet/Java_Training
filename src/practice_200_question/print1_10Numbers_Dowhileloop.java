package practice_200_question;
import java.util.*;
public class print1_10Numbers_Dowhileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int sum =0;
		int i = 0;
		do {
			i = i+2;		
			System.out.println(i);
			sum = sum +i;		
		}		
		while(i < n); 
		System.out.println("Sum:" +sum);
	}
}
