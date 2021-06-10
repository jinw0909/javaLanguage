package test02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(20);
		integerList.add(3);
		integerList.add(5);
		integerList.add(84);
		integerList.add(17);
		
		for (int i = 0; i < integerList.size(); i++) {
			System.out.print(integerList.get(i) + " ");
		}
		System.out.println();
		
		int min = integerList.get(0);
		for (int i = 1; i < integerList.size(); i++) {
			if (integerList.get(i) < min) {
				min = integerList.get(i);
			}  
		}
		System.out.println(min);
		
		Iterator<Integer> iter = integerList.iterator();
		int sum = 0;
		while(iter.hasNext()) {
			int element = iter.next();
			sum += element;
		}
		System.out.println(sum);
		
		Iterator<Integer> iter2 = integerList.iterator();
		while(iter2.hasNext()) {
			int element = iter2.next();
			if (element % 2 == 0) {
				iter2.remove();
			}
		}
		System.out.println(integerList);
		
		int[] array1 = {0, 1, 2, 3};
		int[] array2 = array1;
		array2[3] = 5;
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		List<Integer> integerList2 = integerList;
		integerList2.set(1, 100);
		System.out.println(integerList2);
		System.out.println(integerList);
	}

}
