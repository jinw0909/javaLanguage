package ex02;

import java.util.Scanner;

public class IPhone extends IPodTouch{
	
	private String phoneNumber;
	
	public IPhone(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}
	public void call() {
		System.out.println(this.phoneNumber + " �� ��ȭ��");
	}
	public void sendMessage(String number, String message) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
//		number = scan.nextLine();
//		System.out.print("������ �޼����� �Է��ϼ��� : ");
//		message = scan.nextLine();
		System.out.println(number + "�� " + message + " ����");
	}
}
