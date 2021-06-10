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
		
		// 값 찾기
		if(numbers.contains(33)) {
			System.out.println("33은 있습니다.");
		}
		
		// 정렬
		// 버블 소트, 선택 정렬, 삽입 정렬, 퀵 소트
		numbers.sort(Comparator.naturalOrder());
		System.out.println(numbers);
		
		// 내림 차순
		numbers.sort(Comparator.reverseOrder());
		System.out.println(numbers);
		
		if (numbers.isEmpty()) {
			System.out.println("비어있습니다.");
		}
		numbers.clear();
	}

}
