package Assessment_Prep;
import java.util.*;
public class String_Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int left = 0,right = str.length()-1;
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				System.out.println("Not palindrome");
				return;
			}
			left++;
			right--;
		}
		System.out.println("Palindrome");
		
	}

}
