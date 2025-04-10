package Problem_Statement;
import java.util.Scanner;
public class DAY23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr1[]= {1,3,5};
		int arr2[] = {2,4,6};
		int n1= arr1.length;
		int n2=arr2.length;
		int merged[] = new int[n1+n2];
		int i=0,j=0,k=0;
		while(i < n1 && j < n2) {
			if(arr1[i] < arr2[j]) {
				merged[k++] = arr1[i++];
			}
			else {
				merged[k++] = arr2[j++];
			}
		}
		while(i<n1) {
			merged[k++] = arr1[i++];
		}
		while(j < n2) {
			merged[k++] = arr2[j++];
		}
		for (int m = 0; m < merged.length; m++) {
	        System.out.print(merged[m] + " ");
	    }
	}
}
