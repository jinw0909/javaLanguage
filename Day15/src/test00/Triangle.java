package test00;

public class Triangle {
	private int width;
	private int height;
	
	// 생성자
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double calculateArea() {
		return (this.width * this.height) / 2.0;
	}
	
	@Override
	public String toString() {
		return "밑변 : " + this.width + " 높이" + this.height + " 넓이 : " + this.calculateArea(); 
	}
	
	@Override
	public boolean equals(Object obj) {
		Triangle triangle = (Triangle)obj;
		
		// 가로 세로 길이가 모두 동일할 때 같다고 판단
		if (this.width == triangle.width
				&& this.height == triangle.height) {
			return true;
		} else {
			return false;
		}
	}
}
