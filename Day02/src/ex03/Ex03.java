package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
				
//		System.out.print("������ ������ �Է��ϼ��� ");
//		int noodleCup = scan.nextInt();
//		System.out.println(noodleCup);
//		
//		System.out.println("������ 3���� ������" + (noodleCup * 3) + "�Դϴ�.");
		
		System.out.print("������ ����: ");
		int noodleCup = scan.nextInt();
		System.out.print("����  : ");
		int count = scan.nextInt();
		
		System.out.println("������" + count + "���� ������" + (noodleCup * count) + "�Դϴ�.");
	}

}
