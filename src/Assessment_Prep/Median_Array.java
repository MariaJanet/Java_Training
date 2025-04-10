package Assessment_Prep;

import java.util.Arrays;
import java.util.Scanner;

public class Median_Array {
public static double median(int arr[]) {
		int len = arr.length;
		Arrays.sort(arr);
		if(len % 2 !=0) 
			return len /2 ;
		
		return (arr[(len -1)/2] + arr[len / 2]) / 2.0;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		double ans = median(arr);
		System.out.println(ans);
	}
}
