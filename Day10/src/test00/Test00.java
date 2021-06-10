package test00;

public class Test00 {

	public static void main(String[] args) {
		
		// 길이 구하기
		String text = "Hello";
		int length = text.length();
		System.out.println(length);
		System.out.println(text.length());
		
		// 문자 확인하기
		// char 'a' 'b' 'c'
		// String "abc"
		char character = text.charAt(0);
		System.out.println(character);
		
		// charAt을 이용해서 반복문으로 문자열 출력하기
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i) + " ") ;
		}
		System.out.println();
		
		// 문자열 자르기
		String phoneNumber = "01012345678";
		
		// 010
		String partString = phoneNumber.substring(0, 3);
		System.out.println(partString);
		
		// 1234
		// 시작 인덱스에서 자르고 싶은 길이 만큼을 더한다.
		partString = phoneNumber.substring(3, 7);
		System.out.println(partString);
		
		// 특정 문자로 시작, 끝나는지 확인
		text = "김인규";
		if (text.startsWith("김")) {
			System.out.println("김씨입니다.");
		}
		if (text.endsWith("인규")) {
			System.out.println("이름이 인규 입니다.");
		}
		
		// 문자열 일부 바꾸기
		String replaceText = text.replace("김", "이");
		System.out.println(replaceText);
		
		// 문자열 쪼개기
		text = "김인규,유재석,하하,황광희,조세호";
		String[] names = text.split(",");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
