
public class ReferenceStaticVariable {
	static String name; // 클래스 소속
//	String name1; // 인스턴스 소속
	public ReferenceStaticVariable() {}
	public ReferenceStaticVariable(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		ReferenceStaticVariable reference = new ReferenceStaticVariable();
		reference.checkName();

	}
	public void checkName() {
		ReferenceStaticVariable reference1 = new ReferenceStaticVariable("Sangmin");
		System.out.println(reference1.name);
		ReferenceStaticVariable reference2 = new ReferenceStaticVariable("Sunghun");
		System.out.println(reference1.name);
	}

}
