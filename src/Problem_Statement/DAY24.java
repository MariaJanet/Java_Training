package Problem_Statement;
import java.util.Scanner;
public class DAY24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7,9,10};
		int n= arr.length+1;
		int expectedsum = n*(n+1)/2;
		int actsum=0;
		for(int i=0;i<arr.length;i++) {
			actsum += arr[i];
		}
		int missingnumber = expectedsum - actsum;
		System.out.println(missingnumber);
	}
}
