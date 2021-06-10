package work01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		List<Goods> goods = new ArrayList<>();
		
		while (true) {
			
			System.out.println("(C: create, insert) (R: read, select) (U: update) (D: delete)");
			String crud = scan.nextLine();
			
			switch (crud) {
				case "C": {
					System.out.print("��ǰ���� �Է��ϼ��� : ");
					String name = scan.nextLine();
					System.out.print("������ �Է��ϼ��� : ");
					int price = scan.nextInt();
					scan.nextLine();
					System.out.print("���¸� �Է��ϼ��� : ");
					String status = scan.nextLine();
					
					Goods product = new Goods(name, price, status);
					
					
					if (goods.isEmpty()) {
						goods.add(product);
					}
					Iterator<Goods> iter = goods.iterator();
					while (iter.hasNext()) {
						Goods element = iter.next();
						if (element.getName().equals(name)) {
							System.out.println("��ϵ� ��ǰ�� �����մϴ�.");
							continue;
						} 
						goods.add(product);
					}
					
					System.out.println(goods);
				} 
			}
		}
	}

}
