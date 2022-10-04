package c.string;

public class StringCompare {

	public static void main(String[] args) {
		StringCompare sample = new StringCompare();
		sample.checkString();
	}
	
	public void checkString() {
		String text="공덕";
		System.out.println("text.length()="+text.length());
		System.out.println("text.isEmpty()="+text.isEmpty());
	}
}
