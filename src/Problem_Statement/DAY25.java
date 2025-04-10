package Problem_Statement;
import java.util.Scanner;
public class DAY25 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int res=0;
		int startind =0;
		if(str.charAt(0) == '-') {
			startind =1;
		}
		for(int i=startind;i<str.length();i++) {
			res = res*10 + (str.charAt(i) - '0');
		}
		if(startind == 1) {
			res = -res;
		}
		System.out.println(res);
	}
}
