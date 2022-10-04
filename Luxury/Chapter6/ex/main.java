package Chapter6.ex;

public class main {
	public static void main(String[] args) {
		String s = "Hello";
		String t = s.concat("Java");
		s=t;
		System.out.println(s);
		System.out.println(t);
	}
}
