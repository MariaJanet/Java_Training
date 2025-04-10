package Problem_Statement;
import java.util.*;
public class DAY30 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		int count=0;
		int n=str.length();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				char ch = str.charAt(i);
				if(!(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A'|| ch=='E'|| ch=='I' || ch=='O' || ch=='U')) {
					break;
				}
				count++;
			}
		}
		System.out.print(count);
	}

}
