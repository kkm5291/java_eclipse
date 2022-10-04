package Chapter6;
class MyPoint {
	int a, b;
	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public boolean equals(Object obj) {
		MyPoint p = (MyPoint)obj;
		if (a == p.a && b == p.b) return true;
		else return false;
	}
	public String toString() {
		return "Point(" + a + "," + b + ")";
	}
}
public class practice_1 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println();
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
				
	}
}
