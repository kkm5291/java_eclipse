package Chapter6.ex;

public class ex_6 {
	public static void main(String[] args) {
		int n = 10; 
		Integer intObject = Integer.valueOf(n); //auto boxing
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10;
		System.out.println("m = " + m);
	}
}
