package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//01
		System.out.print("���� �Է��ϼ��� : ");
		//������ �ݺ� Ƚ���� �˷��ִ� ��
		int count = scan.nextInt();
		//Ƚ���� �� ������ �� �ʿ�
		int i = 0;
		while (i < count) {
			System.out.println("�� �ƴϾ�");
			i++;
		}
		
		//02
		System.out.print("ī��Ʈ �ٿ� �Է��ϼ��� : ");
		count = scan.nextInt();
		i = count;
		while (i >= 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("�߻�");
		
		//03
		System.out.println("���� �Է��ϼ��� : ");
		int targetNumber = scan.nextInt();
		i = 0;
		int sum = 0;
		while (i <= targetNumber) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
		//04
		i = 0;
		while (i < 5) {
			System.out.print("�Է� : ");
			int j = scan.nextInt();
			System.out.println("��� : " + j);
			
			i++;
		}
		
		//05
		int number = scan.nextInt();
		i = 1;
		while (i < 10) {
			System.out.println(number + " X " + i + " = " + (number * i));
			i++;
		}
	}

}
