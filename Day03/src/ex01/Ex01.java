package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 몸무게가 70kg 이하라면 치킨을 먹자
		int weight = scan.nextInt();
		
		if(weight <= 70) {
			System.out.println("치킨먹자");
		}
		
		//90kg이 초과되면 다이어트 시작
		if(weight > 90) { //true
			System.out.println("다이어트 시작");
		}
		
		//68kg이면 내 몸무게는 68입니다.
		if(weight == 68 ) {
			System.out.println("68입니다.");
		}
		
		//boolean
		//참과 거짓을 저장 하는 변수 타입
		
		boolean isTrue = weight <= 70;
		System.out.println(isTrue);
		
		

	}

}
