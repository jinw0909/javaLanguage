package ex02;

public class Ex02 {

	public static void main(String[] args) {
		// 세가지 타입
		
		int noodleCup = 850;
		double pi = 3.14;
		char quiz = 'O';
		
		System.out.println("원주율 pi는" + pi);
		System.out.println("퀴즈의 정답은" + quiz + "입니다.");
		
		double divide = noodleCup / (double)7;
		divide = noodleCup / 7.0;
		System.out.println(divide);
		
		quiz = (char) pi;
		System.out.println(quiz);

	}

}
