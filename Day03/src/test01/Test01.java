package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int number = scan.nextInt();
		
		if (number < 10) {
			System.out.println(number + "는 10보다 작습니다.");
		}
		
		System.out.print("두개의 수를 입력하세요 : ");
		int numberA = scan.nextInt();
		int numberB = scan.nextInt();
		
		if (numberA > numberB) {
			System.out.println(">");
		}
		if (numberA < numberB) {
			System.out.println("<");
		}
		if (numberA == numberB) {
			System.out.println("==");
		}
		
		System.out.print("성적을 입력하세요 : ");
		int score = scan.nextInt();
		if (score >= 70) {
			System.out.println("합격");
		} 
		
		System.out.print("수를 입력하세요 : ");
		int numberC = scan.nextInt();
		
		if (numberC % 2 == 0) {
			System.out.println("짝수");
		}
		if (numberC % 2 != 0) {
			System.out.println("홀수");
		}
		
		
		
		
		
	}

}
