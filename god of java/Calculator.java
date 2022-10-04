public class Calculator {
	public static void main(String[] args) {
		System.out.println("Calculator class started");
		Calculator calc = new Calculator();
		int num1 = 10;
		int num2 = 5;
		System.out.println("덧셈="+calc.add(num1, num2));
		System.out.println("subtract="+calc.subtract(num1, num2));
		System.out.println("divide="+calc.divide(num1, num2));
		System.out.println("multiply="+calc.multiply(num1, num2));
	}
	public int add(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
	public int subtract(int num1, int num2) {
		int subtract;
		subtract = num1 - num2;
		return subtract;
	}
	public int multiply(int num1, int num2) {
		int multiply;
		multiply = num1 * num2;
		return multiply;
	}
	public int divide(int num1, int num2) {
		int divide;
		divide = num1 / num2;
		return divide;
	}
}


