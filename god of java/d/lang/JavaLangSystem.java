package d.lang;

public class JavaLangSystem {
	public static void main(String[] args) {
		JavaLangSystem sample = new JavaLangSystem();
		sample.systemPropertiesCheck();
		sample.printNull();
		sample.StringBuilder();
	}
	
	public void systemPropertiesCheck() {
		System.out.println("java.version=" + System.getProperty("java.version"));
		System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME"));
	}
	
	public void printNull() {
		Object obj = null;
//		System.out.println(obj.toString());
		System.out.println(obj + " is object's value");
	}
	
	public void StringBuilder() {
		StringBuilder sb = new StringBuilder();
		sb.append("ABC");
		sb.append("DEF");
		
		System.out.println(sb.toString());
	}
}
