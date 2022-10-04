package Chapter5;

public class _PositivePoint extends _Point {
	public _PositivePoint() {
		super(0, 0);
	}
	public _PositivePoint(int x, int y) {
		super(x, y);
		if(x<0 || y<0) {
			super.move(0, 0);
		}
	}
	
	@Override
	protected void move(int x, int y) {
		if(x>0 && y>0) {
			super.move(x, y);
		}
	}
	
	@Override
	public String toString() {
		return "("+getX()+","+getY()+")"+"의 점";
	}
	public static void main(String[] args) {
		_PositivePoint p = new _PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		
		_PositivePoint p2 = new _PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
	
}
