package test02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		//01
		String a = "Oh";
		String b = "My";
		String c = "God";
		
		System.out.println(a +" "+ b + " " + c);
		
		//02
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID를 입력하세요 : ");
		
		String id = scan.nextLine();
		
		System.out.println("Welcome! " + id);
		
		//03
		String[] joker = new String[3];
 		String temp;
		for (int i = 0; i < 3; i++) {
			joker[i] = scan.next();
		}
		System.out.println(joker);
	}

}
