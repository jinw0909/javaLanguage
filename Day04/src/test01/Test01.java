package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� : ");
		int yong = scan.nextInt();
		System.out.println("ö�� : ");
		int chul = scan.nextInt();
		
		//����
		if (yong == chul) {
			System.out.println("����.");
		} else if ((yong == 1 && chul == 3) ||
				(yong == 2 && chul == 1) ||
				(yong == 3 && chul == 2)) {
			System.out.println("���� �̰��.");
		} else { //ö���� �̱� ���
			System.out.println("ö���� �̰��.");
		}
		
		//����
		int year = 2021;
		
		if (year % 4 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}
		
		if (year % 100 == 0) {
			System.out.println("���");
		} else {
			System.out.println("����");
		}
	}

}
