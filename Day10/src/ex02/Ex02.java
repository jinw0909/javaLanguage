package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 01
		System.out.print("�ܾ �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("e�� ������ " + count + "�� �Դϴ�.");
		
		// 02 
		String gradString = "My grade is A";
		String newGradString = gradString.replace("A", "B");
		System.out.println(newGradString);
		
		// 03
		String phoneNumber = "01012345678";
		String Number1 = phoneNumber.substring(0, 3);
		String Number2 = phoneNumber.substring(3, 7);
		String Number3 = phoneNumber.substring(7, 11);
		System.out.print(Number1 + "-" + Number2 + "-" + Number3);
		System.out.println();
		
		// 04
		gradString = "19950721";
		String birthString = gradString.substring(0, 4);
		int birthInt = Integer.parseInt(birthString);
		int age = 2021 - birthInt + 1;
		System.out.println(birthInt + "���� ���̴� " + age + "��");
		// �ٸ� Ǯ��
		int birth = Integer.parseInt(birthString);
		int year = birth / 10000;
		
		// 05
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] words = sentence.split(" ");
		System.out.println("�ܾ��� ���� : " + words.length);
		// �ٸ� Ǯ��
		count = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				count++;
			}
 		}
		System.out.println(count - 1);
		
		
		
	}

}
