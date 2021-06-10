package ex02;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		
		// Interger, String
		
		List<Member> members = new ArrayList<>();
		
		Member member = new Member("장진우", "010-5137-0460");
		members.add(member);
		members.add(new Member("유재석", "010-000-1111"));
		members.add(new Member("이효리", "010-1234-1111"));
		members.add(new Member("조세호", "010-000-4321"));
		
		System.out.println(members);
		
		Member me = members.get(0);
		System.out.println(me.getName());
		System.out.println(me.getPhoneNumber());
		
		// contains
		Member newMember = new Member("유재석", "010-000-1111");
		if (members.contains(newMember)) {
			System.out.println("포함되어 있습니다.");
		} else {
			System.out.println(newMember);
		}
	}

}
