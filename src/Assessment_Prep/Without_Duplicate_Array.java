package Assessment_Prep;
import java.util.*;
public class Without_Duplicate_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int i,j;
		for( i=0;i<n;i++) {
			for( j = 0;j<i;j++) {
				if(arr[i] == arr[j]) {
					break;
				}
				
			}
			if (j == i) {
				System.out.println(arr[i]);
			}
		}
		

	}

}
