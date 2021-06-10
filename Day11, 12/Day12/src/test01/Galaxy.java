package test01;

public class Galaxy {
	private String maker;
	private String model;
	private String sNumber;
	private String pNumber;
	
	public Galaxy(String maker, String model, String pNumber, String sNumber) {
		this.maker = maker;
		this.model = model;
		this.sNumber = sNumber;
		this.pNumber = pNumber;
	}
	
	public void printInfo() {
		System.out.println(this.maker + "에서 제조된 " + this.model + "입니다.");
		System.out.println("전화번호 : " + this.pNumber);
		System.out.println("일련번호 : " + this.sNumber);
	}
	
	public void call() {
		System.out.println(this.pNumber + " 로 전화를 겁니다 뚜르르르르...");
	}
	
	public void checkSleeping() {
		System.out.println(this.pNumber + " 로 자니? 메시지를 전송 합니다.");
	}
	
}
