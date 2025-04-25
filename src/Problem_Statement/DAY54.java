package Problem_Statement;
import java.util.*;
public class DAY54 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1="anagram";
		String s2="nagaram";
		if(isanagram(s1,s2)) {
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}
		
	}
		public static boolean isanagram(String s1,String s2) {
			if(s1.length() != s2.length()) 
				return false;
			
			char a[] = s1.toCharArray();
			char b[] =s2.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			return Arrays.equals(a,b);
			
		}
}
