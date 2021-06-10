package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.print("�������� ���� ���ڸ� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(number + "�� ������ " + getSquared(number) +"�̴�.");
		
		System.out.print("������ �Է��ϼ��� : ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		int score3 = scan.nextInt();
		int score4 = scan.nextInt();
		System.out.println("����� " + getAverage(score1, score2, score3, score4));
		
		System.out.println("���ڿ� ���� ���� �Է��ϼ��� : ");
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
