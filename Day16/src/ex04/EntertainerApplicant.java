package ex04;

public class EntertainerApplicant implements Act, Sing {

	@Override
	public void act() {
		System.out.println("연기하는중");
		
	}

	@Override
	public void sing() {
		System.out.println("노래하는중");
		
	}
	
}
