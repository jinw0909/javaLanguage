package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1
		System.out.print("�� ���� ���� �Է��ϼ��� : ");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		
		if (number1 % 2 == 0) {
			System.out.println(number1 + "�� ¦���Դϴ�.");
		}
		if (number2 % 2 == 0) {
			System.out.println(number2 + "�� ¦���Դϴ�.");
		}
		if (number3 % 2 == 0) {
			System.out.println(number3 + "�� ¦���Դϴ�.");
		}
		
		//2
		System.out.print("bmi ��ġ�� �Է��ϼ��� : ");
		int bmi = scan.nextInt();
		
		if (bmi <= 10) {
			System.out.println("����");
		} else if (bmi <= 20) {
			System.out.println("��ü��");
		} else {
			System.out.println("��");
		}
		
		//3
		System.out.print("�� ������ �Է��ϼ��� : ");
		int scoreA = scan.nextInt();
		int scoreB = scan.nextInt();
		int average = (scoreA + scoreB) / 2;
		
		if (average >= 70) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		//4
		System.out.print("�� ���� �Է��ϼ��� : ");
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
			System.out.println("2�� �� Ŀ�� ��ü�Ǿ���.");
		}
		if (number3 > max) {
			max = number3;
			System.out.println("3�� �� Ŀ�� ��ü�Ǿ���.");
		}
		
		//5
		System.out.print("���� �Է��ϼ��� : ");
		int month = scan.nextInt();
		
		if (month > 12) {
			System.out.println("���� �Է��ϼ���");
		} else if (month > 11 ) {
			System.out.println("�ܿ�");
		} else if (month > 8) {
			System.out.println("����");
		} else if (month > 5) {
			System.out.println("����");
		} else if (month > 2) {
			System.out.println("��");
		} else if (month > 0) {
			System.out.println("�ܿ�");
		} else {
			System.out.println("���� �Է��ϼ���");
		}
	}

}
