package d.lang;

public class JavaLangNumber {
	public static void main(String[] args) {
		JavaLangNumber sample = new JavaLangNumber();
		sample.numberTypeCheck();
		sample.numberTypeCheck2();
		sample.numberMinMaxCheck();
	}
	
	public void numberTypeCheck() {
		String value1="3";
		String value2="5";
		byte byte1 = Byte.parseByte(value1);
		byte byte2 = Byte.parseByte(value2);
		System.out.println(byte1+byte2); // 8
		
		Integer refInt1=Integer.valueOf(value1);
		Integer refInt2=Integer.valueOf(value2);
		System.out.println(refInt1 + refInt2 + "7"); // 87
		
	}
	
	public void numberTypeCheck2() {
		Integer refInt1;
		refInt1 = 100;
		System.out.println(refInt1.doubleValue()); // 더블값으로 나타내줌
	}
	
	public void numberMinMaxCheck() {
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
	}
}
