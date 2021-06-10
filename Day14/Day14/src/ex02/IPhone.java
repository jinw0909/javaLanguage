package ex02;

import java.util.Scanner;

public class IPhone extends IPodTouch{
	
	private String phoneNumber;
	
	public IPhone(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}
	public void call() {
		System.out.println(this.phoneNumber + " 로 통화중");
	}
	public void sendMessage(String number, String message) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("전송할 번호를 입력하세요 : ");
//		number = scan.nextLine();
//		System.out.print("전송할 메세지를 입력하세요 : ");
//		message = scan.nextLine();
		System.out.println(number + "로 " + message + " 전송");
	}
}
