package test00;

import java.util.Scanner;

public class Lotto {
	
	private int[] number;
	
	public Lotto() {
	}
	
	public void setManual() {
		Scanner scan = new Scanner(System.in);
		System.out.println("6개의 번호를 입력하세요");
		int temp = 0;
		for (int i = 0; i < 6; i++) {
			temp = scan.nextInt();
			if (temp > 0 && temp < 46) {
				this.number[i] = temp;
			} else {
				temp = scan.nextInt();
			}
		}
	}
	public void setAuto() {
		
	}
	
	public int[] getNumber() {
		return this.number;
	}
	
	
	public void printLotto() {
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}
	
	
}
