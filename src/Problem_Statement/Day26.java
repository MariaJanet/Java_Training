package Problem_Statement;
import java.util.Scanner;
public class Day26 {
	public static void main(String[] args) {
		int w1[] = {1, 2, 2, 1, 5, 7};
		int w2[] = {2,2,3,4,5,6};
		for(int i=0;i<w1.length;i++) {
			int count=0;
			for(int k=0;k<i;k++) {
				if(w1[i]==w1[k]) {
					count++;
				}
			}
			if(count==0) {
			for(int j=0;j<w2.length;j++) {
				if(w1[i]==w2[j]) {
					System.out.print(w1[i]+ " ");
					break;
				}
			}
		}
		}
	}
}
