package test01;

public class Test01 {

	public static void main(String[] args) {
		
		// 01
		
		CellPhone galaxy = new CellPhone();
		CellPhone iPhone = new CellPhone();
		
		galaxy.maker = "samsung";
		galaxy.model = "갤럭시s10e";
		galaxy.number = "01012345678";
		
		System.out.println(galaxy.maker);
		System.out.println(galaxy.model);
		System.out.println(galaxy.number);
		
		iPhone.maker = "apple";
		iPhone.model = "iPhoneSE";
		iPhone.number = "0109876543";
		
		System.out.println(iPhone.maker);
		System.out.println(iPhone.model);
		System.out.println(iPhone.number);
		
		// 02
		
		Student[] students = new Student[3];
		
		Student member1 = new Student();
		Student member2 = new Student();
		Student member3 = new Student();
		
		students[0] = member1;
		students[1] = member2;
		students[2] = member3;
		
		member1.name = "유재석";
		member1.className = "java";
		member1.age = "21";
		member1.number = "01023453223";
		
		member2.name = "이효리";
		member2.className = "java";
		member2.age = "23";
		member2.number = "01096482734";
		
		member3.name = "장진우";
		member3.className = "java";
		member3.age = "24";
		member3.number = "01054548484";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].age);
			System.out.println(students[i].className);
			System.out.println(students[i].number);
		}
		
	}

}
