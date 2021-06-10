package homework01;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//04 최소값
		int number = 1000;
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int temp = scan.nextInt();
			if (temp < number) {
				number = temp;
			}
		}
		System.out.println(number);
		
		//05 약수 구하기
		System.out.println("수를 입력하세요 : ");
		number = scan.nextInt();
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
