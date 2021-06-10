package test00;

public class Person {
	String name;
	String birth;
	String gender;
	
	// 나이 구하기
	int getAge(int targetYear) {
		String yearString = birth.substring(0, 4);
		
		int year = Integer.parseInt(birth.substring(0, 4));
		
		return targetYear - year + 1;
	}
	
	void greeting(int targetYear) {
		System.out.println("안녕하세요" + this.name + "입니다.");
		System.out.println("저는 " + this.getAge(targetYear) + "살 " + this.gender + "입니다. 잘 부탁드립니다.");
	}
	
	// 나이를 비교하는 메소드
	int compareAge(Person person) {
		// this
		int thisYear = Integer.parseInt(this.birth.substring(0, 4));
		int targetYear = Integer.parseInt(person.birth.substring(0, 4));
		// 결과가 음수면 파리미터로 받은 객체의 나이가 더 많다
		// 결과가 양수면 현재 자기자신의 객체 나이가 더 많다
		// 결과가 0이면 동갑이다 
		return thisYear - targetYear;
	}
}
