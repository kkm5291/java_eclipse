class Calculator {
	int left, right, third;
	
	public Calculator() {}
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		
	}
	public void setOprands(int left, int right, int third) {
		this.setOprands(left, right);
		this.third = third;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public int avg() {
		return ((this.left + this.right) / 2);
	}
}

class SubstractionableCalculator extends Calculator {
	public SubstractionableCalculator(int left, int right) {
		super(left, right); // super는 부모클래스를 의미함. 
		// 추가적으로 사용할 생성자코드는 아래에다가 작성하는 것이 바람직하다.
	}
	
	public void sum() {
		System.out.println("실행결과는 "+ (this.left + this.right)+"입니다.");
	}

	public void substract() {
		System.out.println(this.left-this.right);
	}
	
	public int avg() {
		return super.avg();
	}
}

class MultiplicationableCalculator extends Calculator{
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

class DivisionableCalculator extends MultiplicationableCalculator{
	public void division() {
		System.out.println(this.left / this.right);
	}
}
public class CalculatorDemo4 {

	public static void main(String[] args) {
	
	SubstractionableCalculator c1 = new SubstractionableCalculator(20, 20);
	c1.substract();
	c1.sum();
	}
	

}
