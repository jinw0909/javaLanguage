package test01;

public class Circle {
	int radius;
	double calculateArea() {
		return radius * radius * 3.14;
	}
	double calculateLength() {
		return radius * 2 * 3.14;
	}
	double calculateArea(int count) {
		return calculateArea() * count;
	}
}
