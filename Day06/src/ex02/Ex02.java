package ex02;

import java.util.Scanner;

public class Ex02 {

	// Math
	public static void main(String[] args) {
		// �Լ� ����ϱ�!!
//		System.out.println("hello");
//		
//		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
		
		// �ݿø��Լ�
		double number = 3.14;
		
		long result = Math.round(number);
		System.out.println(result);
		System.out.println(Math.round(number));
		
		//ū �� ���ϱ�
		int number2 = Math.max(10, 854);
		System.out.println(number2);
		
		//���밪 ���ϱ�
		int number3 = Math.abs(-5);
		System.out.println(number3);
	}

}
