package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int number = scan.nextInt();
		
		if (number < 10) {
			System.out.println(number + "�� 10���� �۽��ϴ�.");
		}
		
		System.out.print("�ΰ��� ���� �Է��ϼ��� : ");
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
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = scan.nextInt();
		if (score >= 70) {
			System.out.println("�հ�");
		} 
		
		System.out.print("���� �Է��ϼ��� : ");
		int numberC = scan.nextInt();
		
		if (numberC % 2 == 0) {
			System.out.println("¦��");
		}
		if (numberC % 2 != 0) {
			System.out.println("Ȧ��");
		}
		
		
		
		
		
	}

}
