package ex02;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		
		// Interger, String
		
		List<Member> members = new ArrayList<>();
		
		Member member = new Member("������", "010-5137-0460");
		members.add(member);
		members.add(new Member("���缮", "010-000-1111"));
		members.add(new Member("��ȿ��", "010-1234-1111"));
		members.add(new Member("����ȣ", "010-000-4321"));
		
		System.out.println(members);
		
		Member me = members.get(0);
		System.out.println(me.getName());
		System.out.println(me.getPhoneNumber());
		
		// contains
		Member newMember = new Member("���缮", "010-000-1111");
		if (members.contains(newMember)) {
			System.out.println("���ԵǾ� �ֽ��ϴ�.");
		} else {
			System.out.println(newMember);
		}
	}

}
