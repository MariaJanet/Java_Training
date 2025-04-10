package Assessment_Prep;
import java.util.*;
public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int o= s.nextInt();
		int n = 0;
		int res = 0;
		int rem = 0;
		while(n>0) {
			rem = n%10;
			res = res +(int)Math.pow(rem, 3);
			n = n/10;
		}
		if(res == n) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not a Armstrong");
		}

	}

}
