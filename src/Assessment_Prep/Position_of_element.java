package Assessment_Prep;

import java.util.Scanner;

public class Position_of_element {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int n1 = s.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i] = s.nextInt();
		}
		for(int i=0;i<n1;i++) {
			int sk = arr1[i];
			int pos = -1;
			for(int j=0;j<n;j++) {
				if(arr[j] == sk) {
					pos = j +1;
					break;
				}
			}
			if(pos != -1) {
				System.out.println(sk + "found at :" +pos);
			}
			else {
				System.out.println(sk + "invalid number");
			}
		}

	}

}
