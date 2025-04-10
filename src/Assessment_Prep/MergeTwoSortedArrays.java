package Assessment_Prep;
import java.util.*;
public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int arr1[] = new int[n1];
		for(int i = 0;i<n1;i++) {
			arr1[i] = s.nextInt();
		}
		int n2 = s.nextInt();
		int arr2[] = new int[n2];
		for(int i =0;i<n2;i++) {
			arr2[i] = s.nextInt();
		}
		int []mergeArray = new int[n1+n2];
		int i=0,j=0,k=0;
		while(i <n1 && j<n2) {
			if(arr1[i] < arr2[j]) {
				mergeArray[k++] = arr1[i++];
			}
			else {
				mergeArray[k++] = arr2[j++];
			}
		}
		while (i < n1) {
            mergeArray[k++] = arr1[i++];
        }
        while (j < n2) {
            mergeArray[k++] = arr2[j++];
        }
        System.out.println("Merged Sorted Array:");
        for (int x = 0; x < mergeArray.length; x++) {
            System.out.print(mergeArray[x] + " ");
        }

	}

}
