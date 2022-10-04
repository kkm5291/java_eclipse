package Chapter4;

public class ex_1 {
	int radius;
	String name;
	
	public ex_1(String name) {
		this.name = name;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		ex_1 pizza = new ex_1("Java");
		pizza.radius = 10;
		pizza.name = "java pizza";
		double area = pizza.getArea();
		System.out.println(pizza.name + " 의 면적은 " + area);
		
		ex_1 donut = new ex_1("Java");
		donut.radius = 2;
		donut.name = "java donut";
		area = donut.getArea();
		System.out.println(donut.name + " 의 면적은 " + area);
	}
	
}
