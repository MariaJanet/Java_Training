package Assessment_Prep;
import java.util.*;
public class Avoid_String_Duplicates {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str= s.nextLine();
		String res ="";
		int i,j;
		for( i=0;i<str.length();i++) {
			for( j = 0;j<i;j++) {
				if(str.charAt(i) == str.charAt(j)) {
					break;
				}
				
			}
			if (j == i) {
				res = res+str.charAt(i);
			}
		}
		System.out.println(res);
		

	}


}
