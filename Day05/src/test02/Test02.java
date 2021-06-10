package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//01 무한루프 탈출
		int i = 0;
		while (true) {
			System.out.println("Hello World");
			i++;
			if (i >= 8) {
				break;
			}
		}
		
		for (i = 0; i > 100; i++) {
			System.out.println("repeat");
		}
		
		//02 짝수 출력
		for (i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		//03 배수 출력
		System.out.println("수를 입력하세요 : ");
		int number = scan.nextInt();
		for (i = 1; i <= 100; i++) {
			if (i % number != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		//04 무한 입력
		while (true) {
			System.out.print("수를 입력하세요 : ");
			number = scan.nextInt();
			if (number == 0) {
				System.out.println("끝");
				break;
			}
		}
		
		
	}

}
