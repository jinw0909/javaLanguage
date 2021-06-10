package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//01
		System.out.print("수를 입력하세요 : ");
		//고정된 반복 횟수를 알려주는 수
		int count = scan.nextInt();
		//횟수를 셀 변수는 꼭 필요
		int i = 0;
		while (i < count) {
			System.out.println("응 아니야");
			i++;
		}
		
		//02
		System.out.print("카운트 다운 입력하세요 : ");
		count = scan.nextInt();
		i = count;
		while (i >= 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("발사");
		
		//03
		System.out.println("수를 입력하세요 : ");
		int targetNumber = scan.nextInt();
		i = 0;
		int sum = 0;
		while (i <= targetNumber) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
		//04
		i = 0;
		while (i < 5) {
			System.out.print("입력 : ");
			int j = scan.nextInt();
			System.out.println("출력 : " + j);
			
			i++;
		}
		
		//05
		int number = scan.nextInt();
		i = 1;
		while (i < 10) {
			System.out.println(number + " X " + i + " = " + (number * i));
			i++;
		}
	}

}
