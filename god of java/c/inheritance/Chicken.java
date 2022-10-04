package c.inheritance;

public class Chicken extends Animal{
	public Chicken(String name, String kind, String hasWing, int legCount, int iq) {
		super(name, kind, hasWing, legCount, iq);
	}
	public void Fly() {
		if(kind == "Chicken") {
			System.out.println("It can't fly");
		}
	}
	public static void main(String[] args) {
		Chicken chicken = new Chicken("BBQ", "Chicken", "Yes", 2, 40);
		chicken.Move();
		chicken.Fly();
	}

}
