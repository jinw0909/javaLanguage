package homework02;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//01 알파벳 출력
		//02 합 구하기
		System.out.println("수를 입력하세요 : ");
		int number = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
			if (sum > 100) {
				break;
			}
		}
		System.out.println(sum);
		
		//03 등차수열
		System.out.print("세 개의 수를 입력하세요");
		int a = scan.nextInt();
		int d = scan.nextInt();
		int n  = scan.nextInt();
	}

}
