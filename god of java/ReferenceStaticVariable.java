
public class ReferenceStaticVariable {
	static String name; // Ŭ���� �Ҽ�
//	String name1; // �ν��Ͻ� �Ҽ�
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
