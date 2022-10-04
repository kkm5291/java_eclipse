package c.inheritance;

public class Equals {

	public static void main(String[] args) {
		Equals eq = new Equals();
		eq.equalMethod();
		

	}
	public void equalMethod() {
		MemberDTO obj1 = new MemberDTO("Sangmin");
		MemberDTO obj2 = new MemberDTO("gondeok");
		if (obj1 == obj2) {
			System.out.println("obj1 and obj2 is same");
		}else {
			System.out.println("obj1 and obj2 is not same");
		}
	}
	public void equalMethod2() {
		MemberDTO obj1 = new MemberDTO("Sangmin");
		MemberDTO obj2 = new MemberDTO("gondeok");
		if (obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 is same");
		}else {
			System.out.println("obj1 and obj2 is not same");
		}
	}

}
