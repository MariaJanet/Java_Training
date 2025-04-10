package Assessment_Prep;
import java.util.*;
public class GamesOfThrones {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String str = s.nextLine();
		int charcount[] = new int[26];
		for(int i=0;i<str.length();i++) {
			charcount[str.charAt(i)-'a']++;
		}
		int odd =0;
		for(int i=0;i<26;i++) {
			if(charcount[i] % 2!=0) {
				odd++;
			}
		}
		if(odd <=1) {
			System.out.println("YES");
		}
		else {
			System.out.println("No");
		}
	}
}
