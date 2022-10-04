package Chapter6;

class Circle {
	int a, b, radius;
	public Circle(int a, int b, int radius) { // int c : radius
		this.a = a; this.b = b; this.radius = radius;
	}
	
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		if(a == c.a && b == c.b) return true;
		else return false;
	}
	
	public String toString() {
		return "Circle(" + a + "," + b + ") 반지름 " + radius;
	}
}


public class practice_2 {
	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}
