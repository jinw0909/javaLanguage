package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// �����԰� 70kg ���϶�� ġŲ�� ����
		int weight = scan.nextInt();
		
		if(weight <= 70) {
			System.out.println("ġŲ����");
		}
		
		//90kg�� �ʰ��Ǹ� ���̾�Ʈ ����
		if(weight > 90) { //true
			System.out.println("���̾�Ʈ ����");
		}
		
		//68kg�̸� �� �����Դ� 68�Դϴ�.
		if(weight == 68 ) {
			System.out.println("68�Դϴ�.");
		}
		
		//boolean
		//���� ������ ���� �ϴ� ���� Ÿ��
		
		boolean isTrue = weight <= 70;
		System.out.println(isTrue);
		
		

	}

}
