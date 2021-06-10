package test01;

import java.util.HashSet;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		Set<Integer> integerSet1 = new HashSet<>();
		integerSet1.add(1);
		integerSet1.add(2);
		integerSet1.add(3);
		integerSet1.add(4);
		
		Set<Integer> integerSet2 = new HashSet<>();
		integerSet2.add(3);
		integerSet2.add(4);
		integerSet2.add(5);
		integerSet2.add(6);
		
		Set<Integer> intersectionSet = new HashSet<>();
		Set<Integer> differenceSet = new HashSet<>();
		Set<Integer> unionSet = new HashSet<>();
		
//		integerSet1.addAll(integerSet2);
//		for (Integer number: integerSet1) {
//			unionSet.add(number);
//		}
		unionSet.addAll(integerSet1);
		unionSet.addAll(integerSet2);
		
		intersectionSet.addAll(integerSet1);
		intersectionSet.retainAll(integerSet2);
		
		differenceSet.addAll(integerSet1);
		differenceSet.removeAll(integerSet2);
		
		
		System.out.println("합집합 : " + unionSet);
		System.out.println("교집합 : " + intersectionSet);
		System.out.println("차집합 : " + differenceSet);
	}

}
