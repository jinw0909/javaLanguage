package test00;

import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) {
		// 삼각형의 넓이
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("밑변 : ");
		int width = scan.nextInt();
		
		System.out.println("높이 : ");
		int height = scan.nextInt();
		
		double area = width * height / 2.0;
		System.out.println("넓이는 : " + area);
		
		//수 두개를 x, y에 입력 받아서 바꿔서 출력하세요
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println(number2 + "" + number1);
		
		//swap
		int tmp = number1;
		number1 = number2;
		number2 = tmp;
		System.out.println(number1 + "" + number2);
		
		//네 자리수 숫자를 입력 받아서 천의 자리부터 한줄씩 출력 하세요.
		//4321
		
		int number = 4321;
		System.out.println(number / 1000);
		
		//321
		number = number % 1000;
		System.out.println(number / 100);
		
		number = number % 100;
		System.out.println(number / 10);
		
		number = number % 10;
		System.out.println(number);
	}

}
