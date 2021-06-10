package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		// �����̸� ����Ʈ
		
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grape");
		
		// �ε��� ���
		for (int i = 0; i < fruits.size(); i++) {
			System.out.print(fruits.get(i) + " ");
			
			// b�� �����ϴ� ���� �̸� ã��
			String element = fruits.get(i);
			if (element.startsWith("b")) {
				System.out.println("b�� �����ϴ� ������ " + fruits.get(i));
			}
		}
		System.out.println();
		
		// ���� for �� : forEach, for in
		for(String element:fruits) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		// Iterator
		Iterator<String> iter = fruits.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
