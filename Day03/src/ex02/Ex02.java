package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int walking = scan.nextInt();
		int weight = scan.nextInt();
		
		//������ �Ѱ� �����԰� 70�����϶� ġŲ�� ����
		if (walking > 10000 && weight <= 70) {
			System.out.println("ġŲ ���� &&");
		}
		
		//������ �Ѱų� �����԰� 70������ �� ġŲ ����
		if (walking > 10000 || weight <= 70) {
			System.out.println("ġŲ ���� ||");
		}
		
		int number = scan.nextInt();
		
		//10 <= number <=40
		if (10 <= number && number <= 40) {
			
		}
		//10 > number, number > 40
		if (10 > number || number > 40) {
			
		}
		
		
	}

}
