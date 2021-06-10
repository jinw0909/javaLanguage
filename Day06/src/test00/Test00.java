package test00;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
//		
		// 1 ~ number
//		int sum = 0;
//		for(int i = 1; i <= number; i++) {
//			sum += i; // sum = sum + i;
//		}
//		System.out.println(sum);
//		
//		// 반복문으로 5개의 수를 입력받아서 총합과 평균을 출력하세요.
//		
//		sum = 0;
//		for(int i = 0; i < 5; i++) {
//			int number1 = scan.nextInt();
//			
//			sum += number1;
//		}
//		System.out.println("총합  : " + sum + "평균 : " + (sum / 5.0));
//		
//		// 반복문으로 5개의 수를 입력 받아서 최소 값을 출력하세요.
//		
//		int min = 0;
//		for(int i = 0; i < 5; i++) {
//			int number1 = scan.nextInt();
//			//만약 지금 입력된 값이 최소값 기록보다 작으면 대체한다.
//			if (i == 0) {
//				min = number1;
//				continue;
//			}
//			if (number1 < min) {
//				min = number1;
//			}
//		}
//		System.out.println(min);
		
		//반복문을 이용해서 A~Z 까지 출력하세요
		//1 ~ 10
		//A ~ Z
//		for (int i = 0; i < 26; i++) {
//			System.out.print((char)(65 + i) + " ");
			
		//소수: 1과 자기자신 이외에 나누어 떨어지지 않는 수이다.
		//수를 입력 받고 그 수가 소수(prime)인지 아닌지 출력하세요.	
		
		// 1에서부터 해당하는 수까지 모든 수를 나누어서 하나라도 나누어떨어지면 소수가 아니다.
		
		int number = scan.nextInt();
		boolean isPrimeNumber = true;
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				System.out.println("소수가 아니다.");
				isPrimeNumber = false;
				break;
//			} else {
//				System.out.println("소수이다.");
//				break;
//			}
		}
//		if (isPrimeNumber) {
//			System.out.println("소수이다.");
//		}
			
		}
	}

}
