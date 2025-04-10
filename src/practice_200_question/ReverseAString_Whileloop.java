package practice_200_question;
import java.util.*;
public class ReverseAString_Whileloop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String str2 = " ";
		int i = str.length()-1;
		while(i >=0) {
			str2 = str2 + str.charAt(i);
			i--;
		}
		System.out.println(str2);
	}
}
