package c.inheritance;

public class Dog extends Animal{
	public Dog(String name, String kind, String hasWing, int legCount, int iq) {
		super(name, kind, hasWing, legCount, iq);
		
	}

	public static void main(String[] args) {
		Dog dog = new Dog("gondeok", "dog", "No", 4, 100);
		dog.Move();
		dog.Fly();
		dog.Sit();
	}
	
}
