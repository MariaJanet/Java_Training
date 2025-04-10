package Assessment_Prep;
import java.util.*;
public class MoveZeroToEnd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int ind = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] !=0) {
				arr[ind] = arr[i];
			
			if(i != ind) {
				arr[i] = 0;
			}
			ind++;
		}
	}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i] +" ");
		}

	}
	

}
