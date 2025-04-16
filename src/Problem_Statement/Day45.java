package Problem_Statement;

public class Day45 {
	public static void toptwoscore(int Scores[]) {
		int first = Integer.MIN_VALUE;
		int sec = Integer.MIN_VALUE;
		for(int i=0;i<Scores.length;i++) {
			int score = Scores[i];
			if(score > first) {
				sec = first;
				first = score;
			}
			else if(score > sec && score != first) {
				sec = score;
			}
		}
		System.out.print("output: [");
		System.out.print(first);
		if(sec != Integer.MIN_VALUE) {
			System.out.print(" "+ sec );
		}
	}
	public static void main(String[] args) {
		int Scores[] = {85,83,70,95};
		toptwoscore(Scores);
		System.out.print("]");
		
	}
}
