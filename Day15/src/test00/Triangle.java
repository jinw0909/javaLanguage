package test00;

public class Triangle {
	private int width;
	private int height;
	
	// ������
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double calculateArea() {
		return (this.width * this.height) / 2.0;
	}
	
	@Override
	public String toString() {
		return "�غ� : " + this.width + " ����" + this.height + " ���� : " + this.calculateArea(); 
	}
	
	@Override
	public boolean equals(Object obj) {
		Triangle triangle = (Triangle)obj;
		
		// ���� ���� ���̰� ��� ������ �� ���ٰ� �Ǵ�
		if (this.width == triangle.width
				&& this.height == triangle.height) {
			return true;
		} else {
			return false;
		}
	}
}
