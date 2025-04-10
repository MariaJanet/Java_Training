package Control_Statement;
import java.util.*;

public class Positive_negative {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		if(n1 >0) {
			System.out.println("Positive");
		}
		else if(n1<0) {
		System.out.println("Negative");
		}
		else {
			System.out.println("num is 0");
		}
		
	}

}
