package Problem_Statement;
import java.util.*;
public class DAY28 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		char ch = s.next().charAt(0);
		int count=0;
		int len = str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.print(count);
	}
}
