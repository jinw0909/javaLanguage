package test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int number = scan.nextInt();
		
		if (number < 0) {
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("����Դϴ�");
		}
				
		System.out.print("������ �Է��ϼ��� : ");
		int score = scan.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
