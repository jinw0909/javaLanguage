package ex02;

import java.util.Scanner;

public class Ex02 {

	// Math
	public static void main(String[] args) {
		// 함수 사용하기!!
//		System.out.println("hello");
//		
//		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
		
		// 반올림함수
		double number = 3.14;
		
		long result = Math.round(number);
		System.out.println(result);
		System.out.println(Math.round(number));
		
		//큰 값 구하기
		int number2 = Math.max(10, 854);
		System.out.println(number2);
		
		//절대값 구하기
		int number3 = Math.abs(-5);
		System.out.println(number3);
	}

}
