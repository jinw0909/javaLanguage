package ex;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		
		// ����Ʈ ����
		ArrayList<Integer> integerList = new ArrayList<>();
		
		// �� �߰�
		integerList.add(20);
		integerList.add(50);
		
		System.out.println(integerList);
		
		// �� ����
		integerList.add(1, 30);
		System.out.println(integerList);
		
		Integer number = integerList.get(2);
		int number2 = integerList.get(0);
		System.out.println(number);
		System.out.println(number2);
		
		// �� ����
		integerList.set(1,  10);
		System.out.println(integerList);
		
		// �� ����
		integerList.remove(2);
		System.out.println(integerList);
		
		// ��� ����
		integerList.clear();
		System.out.println(integerList);
		
		// ���ڿ� ����Ʈ
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
	}

}
