package c.inheritance;

public class ToString {
	String str = "공덕";
	public static void main(String[] args) {
		ToString thisObject = new ToString();
		thisObject.toStringMethod(thisObject);

	}
	
	public void toStringMethod(Object obj) {
		System.out.println(this); // 객체 그대로 출력
		System.out.println(toString()); // toString 불러서 출력
		System.out.println("plus "+this); // 객체의 더하기 연산
		System.out.println();
	}
	
	public String toString() {
		return "ToString class";
	}

}
