
public class ReferenceStatic {
	static String name = "Min";
	public static void main(String[] args) {
		ReferenceStatic.staticMethod();

	}
	public static void staticMethod() {
		System.out.println("This is a static Method");
	}
	public static void staticMethodcallVariable() {
		System.out.println(name);
	}
}
