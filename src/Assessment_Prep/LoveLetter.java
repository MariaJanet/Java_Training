package Assessment_Prep;
import java.util.*;
public class LoveLetter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++) {
			String str = s.nextLine();
			int op=0;
			int q =str.length();
			for(int j=0;j<q/2;j++) {
				op += Math.abs(str.charAt(j) - str.charAt(q-j-1));
			}
			System.out.println(op);
		}
	}
}
