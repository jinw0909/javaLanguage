package test00;

public class Test00 {

	public static void main(String[] args) {
		// T
		Triangle myTri = new Triangle(24, 13);
		System.out.println(myTri);

		Triangle yourTri = new Triangle(25, 14);
		if (myTri.equals(yourTri)) {
			System.out.println("���� �ﰢ��");
		} else {
			System.out.println("�ٸ� �ﰢ��");
		}
	}

}
