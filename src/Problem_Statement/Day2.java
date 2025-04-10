package Problem_Statement;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rats:");
		int r= s.nextInt();
		System.out.println("Enter unit of food:");
		int unit=s.nextInt();
		int n= s.nextInt();
		if (n == 0) {
            System.out.println(-1);
            return;
        }
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int foodrequired = r*unit;
		int foodcollected=0;
		for(int i=0;i<n;i++) {
			foodcollected += arr[i];
			if(foodcollected >= foodrequired) {
				System.out.println(i+1);
				return;
			}
		}
		 System.out.println(0);
	}
}
