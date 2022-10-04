package Chapter5.ex;
class Point_ex5 {
	private int x, y;
	public Point_ex5() {
		this.x = this.y = 0;
	}
	public Point_ex5(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint_ex5 extends Point_ex5 {
	private String color;
	public ColorPoint_ex5(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}
public class ex_3 {
	public static void main(String[] args) {
		ColorPoint_ex5 cp = new ColorPoint_ex5(5, 6, "blue");
		cp.showColorPoint();
		
	}
}
