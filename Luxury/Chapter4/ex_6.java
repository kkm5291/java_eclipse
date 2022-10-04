package Chapter4;

class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class ex_6{
	public static void main(String[] args) {
		Circle [] c;
		c = new Circle[5];
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(i);
		}
	}
}
