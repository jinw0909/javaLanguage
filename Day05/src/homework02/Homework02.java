package homework02;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//01 ���ĺ� ���
		//02 �� ���ϱ�
		System.out.println("���� �Է��ϼ��� : ");
		int number = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
			if (sum > 100) {
				break;
			}
		}
		System.out.println(sum);
		
		//03 ��������
		System.out.print("�� ���� ���� �Է��ϼ���");
		int a = scan.nextInt();
		int d = scan.nextInt();
		int n  = scan.nextInt();
	}

}
