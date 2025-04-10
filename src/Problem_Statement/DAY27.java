package Problem_Statement;
import java.util.*;
public class DAY27 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		if(str1.length() != str2.length()) {
			System.out.print("Not anagram");
			return;
		}
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.print("Anagram");
		}
		else {
			System.out.print("Not");
		}
	}
}
