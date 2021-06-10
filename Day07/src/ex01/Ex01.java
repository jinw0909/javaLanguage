package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int line = scan.nextInt();
//		int half = line / 2;
//		for (int i = 0; i < half + 1; i++)
//		for (int j = 0; j < 1; j++) {
//			System.out.print("-");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < half; i++) {
//			for (int j = 0; j < half - i - 1; j++) {
//				System.out.print("-");
//			}
//			for (int j = 0; j < (i + 1) * 2 + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		1
//		2 5
//		3 6 8
//		4 7 9 10
		
//		int line = 4;
//		
//		
//		for (int i = 0; i < line; i++) {
//			int number = i + 1;
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print(number + " ");
//				number += (line - 1) - j;
//			}
//			System.out.println();
//		}
		
		// 자리수 계산
		// 수를 입력 받고 해당 수가 몇 자리 수인지 출력하세요.
		
		// 수를 입력 하세요 : 432153
		
//		int number = 432153;
//		int count = 0;
//		
//		while (number != 0) {
//			number /= 10;
//			count++;
//		}
//		System.out.println(count);
		
		// 달력 출력하기
		
		System.out.println("2020 / 7");
		System.out.println();
		System.out.println(" S  M  T  W  T  F  S");
		
		int day = -2;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (day <= 0) {
					day++;
					continue;
					
				}
				if (day < 10) {
					System.out.print(" ");
				}
				System.out.print(day + " ");
				day++;
				
				if (day > 31) {
					break;
				}
			}
			System.out.println();
		}
		
		
	}

}
