package test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//01
		
		System.out.print("���� �Է��ϼ��� : ");
		int targetNumber = scan.nextInt();
		
		int i = 0;
		int sum = 0;
		while (i <= targetNumber) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		//02
		
		i = 0;
		sum = 0;
		while (i < 5) {
			int number = 0;
			System.out.print("1��° ���� �Է��ϼ��� : ");
			number = scan.nextInt();
			sum += number;
			i++;
		}
		double average = sum / 5.0;
		System.out.println("���� :" + sum + " ��� : " +average);

		//03
		
		System.out.print("���� �Է��ϼ��� : ");
		int targetFactorial = scan.nextInt();
		i = 0;
		while (i <= targetFactorial) {
			
		}
	}

}
