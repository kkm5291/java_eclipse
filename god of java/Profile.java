public class Profile {
	String name = "±è°ø´ö";
	int age = 4;
	public static void main(String[] args) {
		Profile profile = new Profile();
		profile.setName("±è°ø´ö");
		profile.setAge(4);
		profile.printName();
		profile.printAge();
		
	}
	
	public void setName(String str) {
		name = str;
	}
	
	public void setAge(int val) {
		age = val;
	}
	
	public void printName() {
		System.out.println("My name is " + name);
	}
	
	public void printAge() {
		System.out.println("My age is " + age);
	}
	
}

