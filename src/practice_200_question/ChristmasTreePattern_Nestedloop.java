package practice_200_question;

import java.util.Scanner;

public class ChristmasTreePattern_Nestedloop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int height = s.nextInt();
		int space = height - 1;
		for(int i=1;i<=height;i++) {
			for(int j=1;j<=i+1;j++) {
				for(int k =0;k<space;k++) {
					System.out.print(" ");
				}
				space--;
				for(int star =1;star<=(2*j-1);star++) {
					System.out.print("*");
				}
				System.out.println();
			}
			space = height - i -1;
		}
		int twidth = height/2;
		int theight = height/3;
		space = height -2;
		for (int i = 0; i < theight; i++) {
			for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
			for (int j = 0; j < twidth; j++) {
                System.out.print("*");
            }
			 System.out.println();
		}

	}

}
