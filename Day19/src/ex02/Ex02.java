package ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		// 01
		Map<String, Integer> scores = new HashMap<>();
		
		scores.put("국어", 90);
		scores.put("수학", 85);
		scores.put("영어", 90);
		scores.put("사회", 80);
		scores.put("과학", 100);
		
		System.out.println(scores);
		
		// 02
		int score = scores.get("사회");
		scores.put("사회", score + 5);
		System.out.println(scores);
		
		// 03
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 과목명을 입력하세요 : ");
		String subject = scan.nextLine();
		
		if (scores.containsKey(subject)) {
			System.out.println(scores.get(subject) + "점");
		} else {
			System.out.println("자료 없음");
		}
		
		// 04
		Set<String> keys = scores.keySet();
		for (String key : keys) {
			if (scores.get(key) >= 90) {
				System.out.print(key + " ");
			}
		}
		System.out.println();
		
		
		
		// 05
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String dataKey = iter.next();
			if (scores.get(dataKey) == 100) {
				System.out.println("수상 가능");
				break;
			}
		}
		
		for (String key : keys) {
			if (scores.get(key) == 100) {
				System.out.println("수상 가능");
				break;
			}
		}
	}

}
