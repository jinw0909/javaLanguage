package test03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 01
		List<String> stringList = new ArrayList<>();
		stringList = Arrays.asList("hagulu", "happy", "google", "bts", "iu", "cuteboy");
		System.out.print("id : ");
		String id = scan.nextLine();
		
		if (stringList.contains(id)) {
			System.out.println("중복입니다.");
		} else {
			System.out.println("사용 가능");
		}
		
		// 02
		List<Integer> integerList = new ArrayList<>();
		integerList = Arrays.asList(8, 7, 6, 10, 9, 4);
		
		for(int i = 0; i < integerList.size(); i++) {
			
		}
	
	}
	
	

}
