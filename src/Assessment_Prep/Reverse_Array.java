package Assessment_Prep;
import java.util.*;
public class Reverse_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		for(int i = n-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
	}

}
