package ex02;

public class Ex02 {

	public static void main(String[] args) {
		// 70 이상일 동안 운동을 하자
		
		int weight = 80;
		
		while(weight >= 70) {
			System.out.println("으쌰으쌰" + weight);
			weight -= 2; //weight = weight - 2;
		}
		
		//횟수반복 5번 반복
		
		int i = 0;
		while (i < 5) {
			System.out.println("Hello World" + i);
			i++; // i = i + 1;
		}
		
		i = 5;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
		
		int count = 10;
		
		i = 0;
		while (i < count) {
			System.out.println("반복");
			i++;
		}
		
		//합 구하기
		//1 부터  10까지의 합을 구합시다.
		int sum = 0;
		i = 1;
		while(i <= 10) {
			sum += i; // sum = sum + i;
			System.out.println("log : " + sum);
			i++;
		}
		
		System.out.println(sum);
		
		
		// 카운트 패턴
		// 1 - 10 사이의 짝수의 개수를 출력하세요.
		count = 0;
		i = 1;
		while(i <= 10) {
			if (i % 2 == 0) {
				count++;
			}
			i++;
		}
		
		System.out.println(count);

	}

}
