package Chapter6.ex;
class Rect {
	int width;
	int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) {
		Rect p = (Rect)obj;
		if (width*height == p.width * p.height) return true;
		else return false;
	}
}
public class ex_4 {
	public static void main(String[] args) {
		Rect a = new Rect(2,3);
	}
}
