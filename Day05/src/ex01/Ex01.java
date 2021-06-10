package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello World");
		}
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		
		for (int i = 5; i >=0; i--) {
			System.out.print(i + " ");
		}
		
		Scanner scan = new Scanner(System.in);
		//입력받은 수 만큼 반복
		int count = scan.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println("Hello World");
		}
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
