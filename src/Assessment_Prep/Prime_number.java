package Assessment_Prep;
import java.util.*;
public class Prime_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int count =0;
		if(n>1) {
			for(int i=2;i<n;i++) {
				if(n%i ==0) {
					count++;
					break;
				}
			}
			
		}
		else {
			count = 1;
		}
		if(count == 0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a prime");
		}
		
	}

}
