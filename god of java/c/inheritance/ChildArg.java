package c.inheritance;

public class ChildArg extends ParentArg {
	
	public ChildArg() {
		super("");
		System.out.println("Child Constructor");
	}
	
	public void printName() {
		System.out.println("ChildArg()");
	}
}
