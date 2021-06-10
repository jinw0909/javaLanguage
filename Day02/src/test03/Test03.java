package test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1번
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		System.out.println("이름 : 장진우 나이 : " + age);
		
		//2번
		System.out.print("두 수를 입력하세요");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.println(number1 + " + " + number2 + 
				" = " + (number1 + number2));
		System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
		
		//3번
		System.out.print("단수를 입력하세요");
		int level = scan.nextInt();
		System.out.println(level + " X 1 = " + level * 1 + "\n" + level + " X 2 = " + level * 2);
		System.out.println(level + " X 2 = " + level * 2);
		System.out.println(level + " X 3 = " + level * 3);
				
		//4번
		System.out.print("지름을 입력하세요");
		int dr = scan.nextInt();
		double r = dr / 2.0;
		System.out.println("원의 넓이는 " + r * r * 3.14 + " 입니다");
		
		//
		int second = scan.nextInt();
		System.out.println("초 : " + second);
		int minute = second / 60;
	
	}

}
