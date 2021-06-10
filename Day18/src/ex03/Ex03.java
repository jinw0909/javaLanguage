package ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		Snack snack1 = new Snack("�����", 1200, 150);
		Snack snack2 = new Snack("������", 850, 30);
		Snack snack3 = new Snack("�Ŷ��", 800, 15);
		Snack snack4 = new Snack("õ��ǥ����", 1500, 0);
		
		List<Snack> snacks = new ArrayList<>();
		snacks.add(snack1);
		snacks.add(snack2);
		snacks.add(snack3);
		snacks.add(snack4);
		
		System.out.println(snacks);
		
		//02
		
//		for (int i = 0; i < snacks.size(); i++) {
//			Snack snack = snacks.get(i);
//			if (snack.getStack() == 0) {
//				snacks.remove(i);
//			}
//		}
//		System.out.println(snacks);
		
//		for (Snack snack:snacks) {
//			if (snack.getStack() == 0) {
//				snacks.remove(snack);
//			}
//		}
//		System.out.println(snacks);
		
		Iterator<Snack> iter = snacks.iterator();
		while (iter.hasNext()) {
			Snack snack = iter.next();
			// ��� ������ �����
			if(snack.getStack() == 0) {
				iter.remove();
			}
		}
		System.out.println(snacks);
		
		
		// 03
		System.out.print("��ǰ�� : ");
		String soldName = scan.nextLine();
		System.out.print("���� : ");
		int soldStack = scan.nextInt();
		
		for (int i = 0; i < snacks.size(); i++) {
			Snack snack = snacks.get(i);
			if (snack.getName().equals(soldName)) {
				snack.setStack(snack.getStack() - soldStack); 
			}
		}
		System.out.println(snacks);
		
		// 04
		List<Snack> orderList = new ArrayList<>();
		for (int i = 0; i < snacks.size(); ++i) {
			Snack snack = snacks.get(i);
			if (snack.getStack() <= 30) {
				orderList.add(snacks.get(i));
			}  
		}
		System.out.println(orderList);
		
	}
	

}
