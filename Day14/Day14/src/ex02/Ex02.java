package ex02;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPodTouch iPodTouch = new IPodTouch();
		IPhone iPhone = new IPhone("010-5137-0460");
		
		iPhone.setModel("iPhone");
		iPhone.setMaker("apple");
		System.out.println(iPhone.infoString());
		
		iPhone.internetBrowsing("http://www.google.com");
		iPhone.call();
		iPhone.sendMessage("010-1234-5678", "¤»¤»¤»");
	}

}
