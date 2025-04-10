package Control_Statement;

import java.util.Scanner;

public class WeekDay_Weekend {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		switch(n1) {
		case 1:
		case 7:
			System.out.println("Weekend");
			break;
			switch (n1){
			case 1:
				System.out.println("Sunday");
				break;
			case 3:
				System.out.println("Saturay");
				break;
			}
			break;
			
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("WeekDay");
			break;
			switch(n1) {
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesay");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			}
			break;
			default:
				System.out.println("Invalid");
		
		}
		
		
	}

}
