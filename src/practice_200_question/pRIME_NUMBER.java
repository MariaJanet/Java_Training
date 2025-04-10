package practice_200_question;
import java.util.*;
public class pRIME_NUMBER {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1= s.nextInt();
		int count = 0;
		 
		for(int i=1;i<=n1;i++) {
			if(n1%i==0) {
				count++;
				//break;
			}
			
		}
		if(count == 2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
		

	}

}
