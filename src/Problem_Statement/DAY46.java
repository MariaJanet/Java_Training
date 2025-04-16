package Problem_Statement;

public class DAY46 {
	public static void checkseats(int []seats) {
		for(int i=0;i<seats.length;i++) {
			if(seats[i] %2 ==0) {
				seats[i]=0;
			}
		}
		System.out.print("output: [");
		for(int i=0;i<seats.length;i++) {
			System.out.print(seats[i]);
			if(i != seats.length-1) System.out.print(",");
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		int seats[] = {2, 4, 6, 8};
		checkseats(seats);
		

	}

}
