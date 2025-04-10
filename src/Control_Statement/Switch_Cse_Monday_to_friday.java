package Control_Statement;

import java.util.Scanner;

public class Switch_Cse_Monday_to_friday {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		switch(d){
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wedday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invali number between 1-7");
		
		}
		
		
	}

}
