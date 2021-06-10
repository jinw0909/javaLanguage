package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//01
		for (int i = 35; i <= 40; i++ ) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//02
		for (int i = 5; i >= -5; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//03
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//04 
		int count = 0;
		for (int i = 7; i < 100; i += 7) {
			count++;
		}
		System.out.println("7의 배수의 갯수는 : " + count);
		
		//05
		System.out.print("단수를 입력하세요 : ");
		int level = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(level + " X " + i + " = " + level * i);
		}
		
		//06
		int number = 0;
		for (int i = 0; i < 5 ; i++) {
			System.out.print("수를 입력하세요 : ");
			int temp = scan.nextInt();
			if (temp > number) {
				number = temp;
			}
		}
		System.out.println("가장 큰 수 : " + number);
		
		
		
		
	}

}
