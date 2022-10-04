package d.lang;
/*
 * 1. 일단 메소드 만든 후
 * 메소드 생성 만들어야 함
 * data에 대한 선언을 해야 할 것 같은데
 * data는 숫자나 문자열 가능하며
 * parseLong()메소드 사용, NumberFormatException을 처리할 수 있도록 try-catch문 사용해라
 */
public class NumberObjects {
	public static void main(String[] args) {
		printOtherBase(1024);
		System.out.println((int)Math.pow(2, 10));
	}
	
	public static long parseLong(String data) {
		long retLong = -1;
		try {
			retLong = Long.parseLong(data);
			System.out.println(retLong);
		} catch(NumberFormatException e) {
			System.out.println(data + " is not a number.");
		}
		return retLong;
	}
	
	public static void printOtherBase(long value) {
		System.out.println("Original : " + value);
		System.out.println("Binary : " + Long.toBinaryString(value));
		System.out.println("Hex : " + Long.toHexString(value));
		System.out.println("Octal : " + Long.toOctalString(value));
	}
}
