package ex01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));
//		
//		list.sort(Comparator.naturalOrder());
//		list.remove(5);
//		list.remove(0);
//		
////		int sum = 0;
////		Iterator<Integer> iter = list.iterator();
////		while(iter.hasNext()) {
////			int score = iter.next();
////			sum += score;
////		}
//		int sum = 0;
//		for (int i = 1; i < list.size() - 1; i++) {
//			sum += list.get(i);
//		}
		
//		List<Integer> lotto = new ArrayList<>();
//		Random random = new Random();
//		
//		for(int i = 0; i < 6; i++) {
//			int randomNumber = random.nextInt(45) + 1;
//			//중복 체크
//			if (lotto.contains(randomNumber)) {
//				i--;
//				continue;
//			}
//			
//			lotto.add(randomNumber);
//		}
//		lotto.sort(Comparator.naturalOrder());
//		System.out.println(lotto);
		
		List<String> members = new ArrayList<>();
		members.add("우솝");
		members.add("루피");
		members.add("상디");
		members.add("나미");
		members.add("로빈");
		
		List<String> newMembers = new ArrayList<>();
		newMembers.add("프랑키");
		newMembers.add("루피");
		newMembers.add("쵸파");
		newMembers.add("로빈");
		newMembers.add("로빈");
		newMembers.add("루피");
		
		for (int i = 0; i < newMembers.size(); i++) {
			String newMember = newMembers.get(i);
			
			// 중복시에 뒤에 숫자1을 붙인다
			int count = 1;
			while (members.contains(newMember)) {
				newMember = newMembers.get(i) + count;
				count++;
			}
			members.add(newMember);
		}
		System.out.println(members);
		
	}

}
