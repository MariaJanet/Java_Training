package Problem_Statement;

public class Day44 {
	public static void adjust_loading_order(int container[],int delayhrs) {
		int n=container.length;
		int k= delayhrs %n;
		int []rotated = new int[n];
		for(int i=0;i<n;i++) {
			rotated[(i+k)%n]=container[i];
		}
		System.out.print("new array : [");
		for(int i=0;i<n;i++) {
			System.out.print(rotated[i]);
			if(i != n-1) System.out.print(",");
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		int containers[] = {201, 202, 203, 204} ;
		int delay = 1;
		
		adjust_loading_order(containers,delay);

	}

}
