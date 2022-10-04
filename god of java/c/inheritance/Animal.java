package c.inheritance;

public class Animal {
	String name, kind, hasWing; // 이름, 종, 날개여부
	int legCount, iq; // 다리개수, 지능
	public Animal(String name, String kind, String hasWing, int legCount, int iq) {
		this.name = name;
		this.kind = kind;
		this.hasWing = hasWing;
		this.legCount = legCount;
		this.iq = iq;
	}
	
	public void Move() {
		System.out.println(name+" is moving");
	}
	
	public void Eat() {
		System.out.println(name+"is Eat");
	}
	
	public void Fly() {
		if(hasWing == "Yes") {
			System.out.println("Can Fly");
		}else if(hasWing == "No") {
			System.out.println("Can't Fly");
		}
	}
	
	public void Sit() {
		if(iq > 80) {
			System.out.println("It can Sit");
		}else if(iq <= 80) {
			System.out.println("It can't sit");
		}
	}
}
