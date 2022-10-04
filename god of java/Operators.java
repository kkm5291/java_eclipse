public class Operators {
	int intValue1 = 5;
	int intValue2 = 10;
	public static void main(String[] args) {
		Operators op = new Operators();
		op.complement();
	}
	public void additive() {
		System.out.println(intValue1 + intValue2);
		System.out.println(intValue2 - intValue1);
	}
	public void multipledivision() {
		System.out.println(intValue1 * intValue2);
		System.out.println(intValue2 / intValue1);
	}
	public void remainder() {
		System.out.println(intValue1 % intValue2);
	}
	public void compound() {
		int intValue = 10;
		System.out.println(intValue += 5);
		System.out.println(intValue -= 5);
		System.out.println(intValue *= 5);
		System.out.println(intValue /= 5);
		System.out.println(intValue %= 5);
	}
	public void complement() {
		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);
	}
}
