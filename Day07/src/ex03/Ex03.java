package ex03;

public class Ex03 {

	public static void main(String[] args) {
		// 배열 선언 법
		int[] scores = {100, 95, 90, 80, 100};
		int[] numbers = new int[10];
		
		System.out.println("첫번째 값은 : " + scores[0]);
		System.out.println("두번째 값은 : " + scores[1]);
		System.out.println("세번째 값은 : " + scores[2]);
		
		scores[3] = 90;
		
		// 반복문을 활용해서 배열 다루기
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번째 값은" + scores[i]);
		}
		
		// 평균
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("평균은 " + sum / (double)scores.length);
		
		// 최고점 구하기
		int max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.println("최고점은 " + max);
	}

}
