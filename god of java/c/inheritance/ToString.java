package c.inheritance;

public class ToString {
	String str = "����";
	public static void main(String[] args) {
		ToString thisObject = new ToString();
		thisObject.toStringMethod(thisObject);

	}
	
	public void toStringMethod(Object obj) {
		System.out.println(this); // ��ü �״�� ���
		System.out.println(toString()); // toString �ҷ��� ���
		System.out.println("plus "+this); // ��ü�� ���ϱ� ����
		System.out.println();
	}
	
	public String toString() {
		return "ToString class";
	}

}
