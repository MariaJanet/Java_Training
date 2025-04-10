package Assessment_Prep;
import java.util.*;
public class Avoid_vowels_string {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String res ="";
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch !='A' && ch!= 'E'&&ch != 'I' && ch!='O' && ch !='U'&&ch !='a' && ch!= 'e'&&ch != 'i' && ch!='o' && ch !='u') {
				res = res+ch;
			}
				
		}
		System.out.println(res);

	}

}
