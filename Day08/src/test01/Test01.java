package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 01
		int[] numbers = {3, 5, 2, 10, 39};
		
		System.out.print("변경한 인덱스와 값을 입력하세요 : ");
		int index = scan.nextInt();
		int number = scan.nextInt();
		
		numbers[index] = number;
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		// 02
		
		char[] scores = {'X','O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == 'O') {
				count++;
			}
		}
		
		System.out.println("채점 결과는 " + count * 10 + "점 입니다.");
		
		//03
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		int payNormal = 8500; 
		int payWeekend = 9500;
		int sum = 0;
		for (int i = 0; i < works.length - 2; i++) {
			sum += payNormal * works[i];
		}
		for (int i = works.length - 2; i < works.length; i++) {
			sum += payWeekend * works[i];
		}
		System.out.println("일주일간 총 임금은 " + sum + "원 입니다.");
		
		//04 알파벳 순서
		char[] alphabet = new char[26]; //빈 배열 만들기
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)('A' + i);
			System.out.print(alphabet[i] + " ");
		}
		
		
		//05 배열 값 변경
		System.out.println();
		
		int[] array = new int[5];
		count = 0;
		number = 0;
		while (true) {
			if (count > 4) { //예외처리
				break;
			}
			System.out.println("수를 입력하세요 : ");
			number = scan.nextInt();
			if (number % 2 == 0) {
				array[count] = number;
				count++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
