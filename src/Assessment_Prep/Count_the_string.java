package Assessment_Prep;
import java.util.*;
public class Count_the_string {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String str = s.nextLine().toLowerCase();
		String[] words = str.split("\\s+");
		int count = 0;
		for(int i =0;i<words.length;i++) {
			if(words[i].equals("the")) {
				count++;
			}
		}
		System.out.println(count);

	}

}
