package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.print("제곱값을 구할 숫자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(number + "의 제곱은 " + getSquared(number) +"이다.");
		
		System.out.print("점수를 입력하세요 : ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		int score3 = scan.nextInt();
		int score4 = scan.nextInt();
		System.out.println("평균은 " + getAverage(score1, score2, score3, score4));
		
		System.out.println("숫자와 나눌 수를 입력하세요 : ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		printQuotientRemainder(number1, number2);
		
		
	}
	
	public static int getSquared(int number) {
		return (int)Math.pow(number, 2);
	}
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		return (score1 + score2 + score3 + score4) / 4.0;
	}
	
	public static void printQuotientRemainder(int number1, int number2) {
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println(quotient + " " + remainder);
	}
	
}
