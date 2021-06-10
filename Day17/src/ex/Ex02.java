package ex;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		
		// 리스트 생성
		ArrayList<Integer> integerList = new ArrayList<>();
		
		// 값 추가
		integerList.add(20);
		integerList.add(50);
		
		System.out.println(integerList);
		
		// 값 삽입
		integerList.add(1, 30);
		System.out.println(integerList);
		
		Integer number = integerList.get(2);
		int number2 = integerList.get(0);
		System.out.println(number);
		System.out.println(number2);
		
		// 값 수정
		integerList.set(1,  10);
		System.out.println(integerList);
		
		// 값 삭제
		integerList.remove(2);
		System.out.println(integerList);
		
		// 모두 삭제
		integerList.clear();
		System.out.println(integerList);
		
		// 문자열 리스트
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
	}

}
