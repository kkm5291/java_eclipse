
public class StaticBlock {
	static int data= 1;
	
	public StaticBlock() {
		System.out.println("StatickBlock Constructor");
	}
	
	static {
		System.out.println("*** First static Block ***");
		
	}
	
	static {
		System.out.println("*** Second static Block ***");
		data=5;
	}
	public static int getData() {
		return data;
	}
}
