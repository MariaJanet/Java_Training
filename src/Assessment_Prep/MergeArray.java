package Assessment_Prep;
import java.util.*;
public class MergeArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int arr1[] = new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i] = s.nextInt();
		}
		int n2 = s.nextInt();
		int arr2[] = new int[n2];
		for(int i=0;i<n2;i++) {
			arr2[i] = s.nextInt();
		}
		int c = (n1-1) + (n2-1);
		int c1[] = new int[c];
		for(int i=0;i<n1;i = i+1) {
			c1[i] = arr1[i];
		}
		for(int i=0;i<n2;i = i+1) {
			c1[n2+i] = arr2[i];
		}
		System.out.println(" "+ Arrays.toString(c1));

	}

}
