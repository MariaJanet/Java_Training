package Problem_Statement;
import java.util.Arrays;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		if(n%2 !=0) {
			System.out.print("[]");
			return;
		}
		Arrays.sort(arr);
		int Oa[]=new int[n/2];
		int oindex =0;
		int used[] = new int[n];
		for(int i=0;i<n;i++) {
			if(used[i]==1) {
				continue;
			}
			int found=0;
			for(int j=i+1;j<n;j++) {
				if(arr[j]==2*arr[i] &&used[j]==0) {
					used[j]=1;
					found=1;
					break;
				}
			}
			if(found==0) {
				System.out.println("[]");
				return;
			}
			Oa[oindex++] =arr[i];
		}
		System.out.print("[");
		for(int i=0;i<oindex;i++) {
			System.out.print(Oa[i]);
			if (i < oindex - 1) {
                System.out.print(", ");
            }
		}
		 System.out.println("]");
	}

}
