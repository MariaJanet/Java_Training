package Assessment_Prep;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int(a);
		for(int i=0;i<a;i++) {
			arr[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		int s = 0;
		for(int i=0;i<a;i++) {
			if(arr[i]>0) {
				s = arr[i]*n;
			}
			System.out.println(s);
		}
		for(int i=0;i<a;i++) {
			System.out.println(Arrays.sort(s));
		}

	}

}
