package practice_200_question;
import java.util.*;
public class Leap_year {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int yr = s.nextInt();
		if(yr%4==0 && yr%400==0 || yr%100 !=0) {
			System.out.println("Leap yr");
		}
		else {
			System.out.println("NOT leap year");
		}

	}

}
