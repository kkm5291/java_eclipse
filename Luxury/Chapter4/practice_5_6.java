package Chapter4;
import java.util.*;
class Circle_practice{
	private double x, y;
	private int radius;
	public Circle_practice(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public int getRadius() {
		return radius;
	}
}
public class practice_5_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle_practice[] c = new Circle_practice[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle_practice(x, y, radius);
		}
		
		int max=0;
		int find=0;
		for(int i=0; i<c.length; i++) {
			c[i].show();
			if(max < c[i].getRadius()) {
				max = c[i].getRadius();
				find = i;
			}
		}
		System.out.print("가장 면적이 큰 원은? ");
		c[find].show();
	}
}
