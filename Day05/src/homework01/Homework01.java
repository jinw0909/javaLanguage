package homework01;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//04 �ּҰ�
		int number = 1000;
		for (int i = 0; i < 5; i++) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int temp = scan.nextInt();
			if (temp < number) {
				number = temp;
			}
		}
		System.out.println(number);
		
		//05 ��� ���ϱ�
		System.out.println("���� �Է��ϼ��� : ");
		number = scan.nextInt();
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
