package ex02;

public class Ex02 {

	public static void main(String[] args) {
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
		//01
		for (int i = 0; i < scores.length; i++) {
			int indiSum = 0;
			double indiAvg = 0;
			for (int j = 0; j < scores[i].length; j++) {
				indiSum += scores[i][j];
			}
			indiAvg = indiSum / (double)(scores[i].length);
			System.out.println((i + 1) + "번째 학생의 평균 : " + indiAvg);
		}
		
		//02
		System.out.println();
		
		for (int i = 0; i < scores.length; i++) {
			int indiMax = 0;
			for (int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] > indiMax) {
					indiMax = scores[i][j];
				}
			}
			System.out.println((i + 1) + "번째 학생의 최고점 : " + indiMax);
		} 
		
		//03
		System.out.println();
		// int totalSum = 0;
		int totalMax = 0;
		int totalMaxIdx = 0;
		double totalMaxAvg = 0;
		for (int i = 0; i < scores.length; i++) {
			int indiSum = 0;
			int indiMax = 0;
			for (int j = 0; j < scores[i].length; j++) {
				indiSum += scores[i][j];
				if (scores[i][j] > indiMax) {
					indiMax = scores[i][j];
				}
			}
			// totalSum += indiSum;
			if (indiSum > totalMax) {
				totalMax = indiSum;
				totalMaxIdx = i;
				totalMaxAvg = totalMax / (double)(scores[i].length);
			}
			
		}
		System.out.println("평균이 가장 높은 학생 : " + (totalMaxIdx + 1) + "번째 학생");
		System.out.println("평균 : " + totalMaxAvg + "점");
		
		//04
		System.out.println();
		
//		int index = scan.nextInt();
		// int totalSum = 0;
//		int totalMax = 0;
//		int totalMaxIdx = 0;
//		double totalMaxAvg = 0;
//		for (int i = 0; i < scores.length; i++) {
//			int indiSum = 0;
//			int indiMax = 0;
//			for (int j = 0; j < scores[i].length; j++) {
//				indiSum += scores[i][j];
//				if (scores[i][j] > indiMax) {
//					indiMax = scores[i][j];
//				}
//			}
//			// totalSum += indiSum;
//			if (indiSum > totalMax) {
//				totalMax = indiSum;
//				totalMaxIdx = i;
//				totalMaxAvg = (double)(totalMax / (scores[i].length));
//			}
//			
//		}
//		System.out.println("평균이 가장 높은 학생 : " + (totalMaxIdx + 1) + "번째 학생");
//		System.out.println("평균 : " + totalMaxAvg + "점");

	}

}
