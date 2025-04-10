package Assessment_Prep;
import java.util.*;
public class max_min_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = s.nextInt();
		int []arr = new int[n];
		System.out.println("Enter elements");
		for(int i = 0;i<n;i++) {
			arr[i] = s.nextInt();	
		}
		int max = arr[0];
		int min = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum:" +max);
		System.out.println("Minimum:" +min);

	}

}
