package test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1��
		System.out.println("���̸� �Է��ϼ���");
		int age = scan.nextInt();
		System.out.println("�̸� : ������ ���� : " + age);
		
		//2��
		System.out.print("�� ���� �Է��ϼ���");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.println(number1 + " + " + number2 + 
				" = " + (number1 + number2));
		System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
		
		//3��
		System.out.print("�ܼ��� �Է��ϼ���");
		int level = scan.nextInt();
		System.out.println(level + " X 1 = " + level * 1 + "\n" + level + " X 2 = " + level * 2);
		System.out.println(level + " X 2 = " + level * 2);
		System.out.println(level + " X 3 = " + level * 3);
				
		//4��
		System.out.print("������ �Է��ϼ���");
		int dr = scan.nextInt();
		double r = dr / 2.0;
		System.out.println("���� ���̴� " + r * r * 3.14 + " �Դϴ�");
		
		//
		int second = scan.nextInt();
		System.out.println("�� : " + second);
		int minute = second / 60;
	
	}

}
