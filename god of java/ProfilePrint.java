public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;
	
	public static void main(String[] args) {
		ProfilePrint profile = new ProfilePrint();
		byte age = 4;
		String name = "°ø";
		boolean isMarried = false;
		
		profile.setAge(age);
		profile.setName(name);
		profile.setMarried(isMarried);
		
		System.out.println(profile.getAge());
		System.out.println(profile.getName());
		System.out.println(profile.isMarried());
	}
	
	public void setAge(byte paraage) {
		age = paraage;
	}
	public byte getAge() {
		return age;
	}
	public void setName(String paraname) {
		name = paraname;
	}
	public String getName() {
		return name;
	}
	public void setMarried(boolean paramarried) {
		isMarried = paramarried;
	}
	public boolean isMarried() {
		return isMarried;
	}
}
