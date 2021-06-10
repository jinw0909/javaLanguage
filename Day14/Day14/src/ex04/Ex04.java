package ex04;

public class Ex04 {

	public static void main(String[] args) {
		Person chang = new Person("장진우", 22);
		Person lee = new Person("장진우", 22);
		
		if(chang.equals(lee)) {
			System.out.println("같은 사람");
		} else {
			System.out.println("다른 사람");
		}

	}

}
