package test00;

public class Grade {
	String name;
	int[] scores;
	
	double getAverage() {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		return sum / (double)scores.length;
	}
	
	
}
