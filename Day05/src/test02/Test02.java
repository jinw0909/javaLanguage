package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//01 ���ѷ��� Ż��
		int i = 0;
		while (true) {
			System.out.println("Hello World");
			i++;
			if (i >= 8) {
				break;
			}
		}
		
		for (i = 0; i > 100; i++) {
			System.out.println("repeat");
		}
		
		//02 ¦�� ���
		for (i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		//03 ��� ���
		System.out.println("���� �Է��ϼ��� : ");
		int number = scan.nextInt();
		for (i = 1; i <= 100; i++) {
			if (i % number != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		//04 ���� �Է�
		while (true) {
			System.out.print("���� �Է��ϼ��� : ");
			number = scan.nextInt();
			if (number == 0) {
				System.out.println("��");
				break;
			}
		}
		
		
	}

}
