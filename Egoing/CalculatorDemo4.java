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
		super(left, right); // super�� �θ�Ŭ������ �ǹ���. 
		// �߰������� ����� �������ڵ�� �Ʒ����ٰ� �ۼ��ϴ� ���� �ٶ����ϴ�.
	}
	
	public void sum() {
		System.out.println("�������� "+ (this.left + this.right)+"�Դϴ�.");
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
