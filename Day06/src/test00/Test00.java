package test00;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
//		
		// 1 ~ number
//		int sum = 0;
//		for(int i = 1; i <= number; i++) {
//			sum += i; // sum = sum + i;
//		}
//		System.out.println(sum);
//		
//		// �ݺ������� 5���� ���� �Է¹޾Ƽ� ���հ� ����� ����ϼ���.
//		
//		sum = 0;
//		for(int i = 0; i < 5; i++) {
//			int number1 = scan.nextInt();
//			
//			sum += number1;
//		}
//		System.out.println("����  : " + sum + "��� : " + (sum / 5.0));
//		
//		// �ݺ������� 5���� ���� �Է� �޾Ƽ� �ּ� ���� ����ϼ���.
//		
//		int min = 0;
//		for(int i = 0; i < 5; i++) {
//			int number1 = scan.nextInt();
//			//���� ���� �Էµ� ���� �ּҰ� ��Ϻ��� ������ ��ü�Ѵ�.
//			if (i == 0) {
//				min = number1;
//				continue;
//			}
//			if (number1 < min) {
//				min = number1;
//			}
//		}
//		System.out.println(min);
		
		//�ݺ����� �̿��ؼ� A~Z ���� ����ϼ���
		//1 ~ 10
		//A ~ Z
//		for (int i = 0; i < 26; i++) {
//			System.out.print((char)(65 + i) + " ");
			
		//�Ҽ�: 1�� �ڱ��ڽ� �̿ܿ� ������ �������� �ʴ� ���̴�.
		//���� �Է� �ް� �� ���� �Ҽ�(prime)���� �ƴ��� ����ϼ���.	
		
		// 1�������� �ش��ϴ� ������ ��� ���� ����� �ϳ��� ����������� �Ҽ��� �ƴϴ�.
		
		int number = scan.nextInt();
		boolean isPrimeNumber = true;
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				System.out.println("�Ҽ��� �ƴϴ�.");
				isPrimeNumber = false;
				break;
//			} else {
//				System.out.println("�Ҽ��̴�.");
//				break;
//			}
		}
//		if (isPrimeNumber) {
//			System.out.println("�Ҽ��̴�.");
//		}
			
		}
	}

}
