package Problem_Statement;

import java.util.List;

public class DAY43 {
	public static List<Integer> findtrafficpeak(int []trafficdata){
		List<Integer> peak = new ArrayList<>();
		for(int i=1;i<trafficdata.length-1;i++) {
			if(trafficdata[i] > trafficdata[i-1] && trafficdata[i] > trafficdata[i+1]) {
				peak.add(i);		
			}
		}
		return peak;
		
	}

	public static void main(String[] args) {
		int trafficdata[] = {12, 25, 40, 20, 15, 50, 45, 30};
		System.out.print(trafficdata);
		
	}
}
