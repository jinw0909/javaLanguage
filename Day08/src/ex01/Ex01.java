package ex01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = {
				{90, 100, 80},
				{70, 90, 98},
				{80, 50, 78},
				{100, 90, 88},
				{95, 78, 88},
		};
		System.out.println("3번째 학생의 2번째 점수 " + scores[2][1]);
		System.out.println("2번째 학생의 1번째 점수 " + scores[1][0]);
		System.out.println("5번째 학생의 3번째 점수 " + scores[4][2]);

		//반복문으로 접근 하고 출력하기
		for (int i = 0; i < scores.length; i++) { //배열에 접근하기
			for(int j = 0; j < scores[i].length; j++) { //배열 안에 있는 값 접근하기
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		// 학생별 평균 구하기
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			System.out.println(sum / 3.0);
		}
	}

}
