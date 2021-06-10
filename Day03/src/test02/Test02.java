package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 점수를 입력하세요 : ");
		int scoreA = scan.nextInt();
		int scoreB = scan.nextInt();
		
		if (scoreA >= 70 && scoreB >= 70) {
			System.out.println("합격입니다.");
		}
		
		System.out.print("수를 입력하세요 : ");
		int common = scan.nextInt();
		
		if (common % 3 == 0 && common % 2 ==0) {
			System.out.println(common + "는 2와 3의 공배수 입니다.");
		}
		
		System.out.print("1 ~ 10 사이의 수를 입력하세요");
		int between = scan.nextInt();
		
		if (between < 1 || between > 10) {
			System.out.println("잘못 입력하셨습니다.");
		} 
	}

}
