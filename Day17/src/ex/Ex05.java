package ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(50);
		numbers.add(20);
		numbers.add(40);
		numbers.add(30);
		numbers.add(10);
		
		// �� ã��
		if(numbers.contains(33)) {
			System.out.println("33�� �ֽ��ϴ�.");
		}
		
		// ����
		// ���� ��Ʈ, ���� ����, ���� ����, �� ��Ʈ
		numbers.sort(Comparator.naturalOrder());
		System.out.println(numbers);
		
		// ���� ����
		numbers.sort(Comparator.reverseOrder());
		System.out.println(numbers);
		
		if (numbers.isEmpty()) {
			System.out.println("����ֽ��ϴ�.");
		}
		numbers.clear();
	}

}
