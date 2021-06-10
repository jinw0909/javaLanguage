package ex01;

public class Ex01 {

	public static void main(String[] args) {
		// 사람 클래스를 만들고 생성자를 활용
		Person chang = new Person("장진우", "19890909", "남자2");
		System.out.println(chang.getName());
		chang.setName("존레논");
		System.out.println(chang.getName());
	}

}
