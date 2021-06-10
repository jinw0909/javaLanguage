package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1
		System.out.print("세 개의 수를 입력하세요 : ");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		
		if (number1 % 2 == 0) {
			System.out.println(number1 + "는 짝수입니다.");
		}
		if (number2 % 2 == 0) {
			System.out.println(number2 + "는 짝수입니다.");
		}
		if (number3 % 2 == 0) {
			System.out.println(number3 + "는 짝수입니다.");
		}
		
		//2
		System.out.print("bmi 수치를 입력하세요 : ");
		int bmi = scan.nextInt();
		
		if (bmi <= 10) {
			System.out.println("정상");
		} else if (bmi <= 20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		
		//3
		System.out.print("두 점수를 입력하세요 : ");
		int scoreA = scan.nextInt();
		int scoreB = scan.nextInt();
		int average = (scoreA + scoreB) / 2;
		
		if (average >= 70) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		//4
		System.out.print("세 수를 입력하세요 : ");
		int numberA = scan.nextInt();
		int numberB = scan.nextInt();
		int numberC = scan.nextInt();
		
		if (numberA > numberB && numberA > numberC) {
			System.out.println(numberA);
		} else if (numberB > numberA && numberB > numberC) {
			System.out.println(numberB);
		} else if (numberC > numberA && numberC > numberB) {
			System.out.println(numberC);
		}
		
		int max = number1;
		if (number2 > max) {
			max = number2;
			System.out.println("2가 더 커서 교체되었다.");
		}
		if (number3 > max) {
			max = number3;
			System.out.println("3이 더 커서 교체되었다.");
		}
		
		//5
		System.out.print("월을 입력하세요 : ");
		int month = scan.nextInt();
		
		if (month > 12) {
			System.out.println("월을 입력하세요");
		} else if (month > 11 ) {
			System.out.println("겨울");
		} else if (month > 8) {
			System.out.println("가을");
		} else if (month > 5) {
			System.out.println("여름");
		} else if (month > 2) {
			System.out.println("봄");
		} else if (month > 0) {
			System.out.println("겨울");
		} else {
			System.out.println("월을 입력하세요");
		}
	}

}
