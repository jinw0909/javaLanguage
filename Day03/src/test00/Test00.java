package test00;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		// �ﰢ���� ����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�غ� : ");
		int width = scan.nextInt();
		
		System.out.println("���� : ");
		int height = scan.nextInt();
		
		double area = width * height / 2.0;
		System.out.println("���̴� : " + area);
		
		//�� �ΰ��� x, y�� �Է� �޾Ƽ� �ٲ㼭 ����ϼ���
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println(number2 + "" + number1);
		
		//swap
		int tmp = number1;
		number1 = number2;
		number2 = tmp;
		System.out.println(number1 + "" + number2);
		
		//�� �ڸ��� ���ڸ� �Է� �޾Ƽ� õ�� �ڸ����� ���پ� ��� �ϼ���.
		//4321
		
		int number = 4321;
		System.out.println(number / 1000);
		
		//321
		number = number % 1000;
		System.out.println(number / 100);
		
		number = number % 100;
		System.out.println(number / 10);
		
		number = number % 10;
		System.out.println(number);
	}

}
