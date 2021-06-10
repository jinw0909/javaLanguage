package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		
//		integerList.add(3);
//		integerList.add(8);
		integerList = Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5);
		
		System.out.println(integerList);
		
		integerList.set(3, 6);
		
		System.out.println(integerList);
		
		

	}

}
