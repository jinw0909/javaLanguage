package test01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿µÈñ : ");
		int yong = scan.nextInt();
		System.out.println("Ã¶¼ö : ");
		int chul = scan.nextInt();
		
		//ºñ±ä´Ù
		if (yong == chul) {
			System.out.println("ºñ°å´Ù.");
		} else if ((yong == 1 && chul == 3) ||
				(yong == 2 && chul == 1) ||
				(yong == 3 && chul == 2)) {
			System.out.println("¿µÈñ°¡ ÀÌ°å´Ù.");
		} else { //Ã¶¼ö°¡ ÀÌ±ä °æ¿ì
			System.out.println("Ã¶¼ö°¡ ÀÌ°å´Ù.");
		}
		
		//À±³â
		int year = 2021;
		
		if (year % 4 == 0) {
			System.out.println("À±³â");
		} else {
			System.out.println("Æò³â");
		}
		
		if (year % 100 == 0) {
			System.out.println("Æò³â");
		} else {
			System.out.println("À±³â");
		}
	}

}
