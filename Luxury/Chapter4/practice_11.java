package Chapter4;
import java.util.Scanner;
abstract class Calc {
	int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}
class Add extends Calc {
	int calculate() {
		return a+b;
	}
}
class Sub extends Calc {
	int calculate() {
		return a-b;
	}
}
class Mul extends Calc {
	int calculate() {
		return a*b;
	}
}
class Div extends Calc{
	int calculate() {
		return a/b;
	}
}

public class practice_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);
		if(c == '+') {
			Add add = new Add();
			add.setValue(a, b);
			result = add.calculate();
		}
		else if(c == '-') {
			Sub sub = new Sub();
			sub.setValue(a, b);
			result = sub.calculate();
		}
		else if(c == '/') {
			Div div = new Div();
			div.setValue(a, b);
			result = div.calculate();
		}
		else if(c =='*') {
			Mul mul = new Mul();
			mul.setValue(a, b);
			result = mul.calculate();
			
		}
		System.out.println(result);
	}
}
