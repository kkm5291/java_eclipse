package Chapter5;
class Point {
	private int x, y;
	public Point() {this.x = 0; this.y = 0;}
	public Point(int x, int y) { this.x = x; this.y = y;}
	public int getX() { return x;}
	public int getY() { return y;}
	protected void move(int x, int y) { this.x = x; this.y = y;}
}

class ColorPoint extends Point {
	private String color;
	public ColorPoint() {
		super();
		this.color = "black";
	}
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "black";
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return color+"색의 "+"("+getX()+","+getY()+")"+"의 점";
	}
	
}

public class practice_5 {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString());
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}
