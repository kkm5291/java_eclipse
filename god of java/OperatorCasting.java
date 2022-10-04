public class OperatorCasting {
	public static void main(String[] args) {
		OperatorCasting operator = new OperatorCasting();
		operator.casting();
	}
	
	public void casting() {
		byte byteValue=127;
		short shortValue=byteValue;
		
		shortValue++;
		System.out.println(shortValue);
		byteValue=(byte)shortValue;
		System.out.println(byteValue);
	}
}
