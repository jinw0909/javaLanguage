package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int walking = scan.nextInt();
		int weight = scan.nextInt();
		
		//만보가 넘고 몸무게가 70이하일때 치킨을 먹자
		if (walking > 10000 && weight <= 70) {
			System.out.println("치킨 먹자 &&");
		}
		
		//만보가 넘거나 몸무게가 70이하일 때 치킨 먹자
		if (walking > 10000 || weight <= 70) {
			System.out.println("치킨 먹자 ||");
		}
		
		int number = scan.nextInt();
		
		//10 <= number <=40
		if (10 <= number && number <= 40) {
			
		}
		//10 > number, number > 40
		if (10 > number || number > 40) {
			
		}
		
		
	}

}
