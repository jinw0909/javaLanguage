package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� ������ �Է��ϼ��� : ");
		int scoreA = scan.nextInt();
		int scoreB = scan.nextInt();
		
		if (scoreA >= 70 && scoreB >= 70) {
			System.out.println("�հ��Դϴ�.");
		}
		
		System.out.print("���� �Է��ϼ��� : ");
		int common = scan.nextInt();
		
		if (common % 3 == 0 && common % 2 ==0) {
			System.out.println(common + "�� 2�� 3�� ����� �Դϴ�.");
		}
		
		System.out.print("1 ~ 10 ������ ���� �Է��ϼ���");
		int between = scan.nextInt();
		
		if (between < 1 || between > 10) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} 
	}

}
