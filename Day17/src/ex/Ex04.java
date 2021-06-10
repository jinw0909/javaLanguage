package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		// 과일이름 리스트
		
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grape");
		
		// 인덱스 기반
		for (int i = 0; i < fruits.size(); i++) {
			System.out.print(fruits.get(i) + " ");
			
			// b로 시작하는 과일 이름 찾기
			String element = fruits.get(i);
			if (element.startsWith("b")) {
				System.out.println("b로 시작하는 과일은 " + fruits.get(i));
			}
		}
		System.out.println();
		
		// 향상된 for 문 : forEach, for in
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
