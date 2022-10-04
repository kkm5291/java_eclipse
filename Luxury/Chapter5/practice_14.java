package Chapter5;
class Oval implements Shape {
	int a, b;
	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void draw() {
		System.out.println(a+"X"+b+" 사각형에 내접하는 타원입니다.");
	}
	@Override
	public double getArea() {
		return a*b*PI;
	}
}

class Rect implements Shape {
	int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.println(width+"X"+height+" 크기의 사각형");
	}
	@Override
	public double getArea() {
		return width * height;
	}
}

public class practice_14 {
	public static void main(String[] args) {
		Shape[] list = new Shape [3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("면적은 " +list[i].getArea());
	}
}
