
public class ReferenceOverloading {

	public static void main(String[] args) {
		ReferenceOverloading reference = new ReferenceOverloading(); // ��ü�� �����ϴ� ��
		reference.print(20);
		reference.print("Hi");
		reference.print(20, "Fuck you");
		reference.print("�������� ��ȭ�� ��� �ؾ��ұ�?", 20);
	}
	public void print(int data) {
		System.out.println(data);
	}
	public void print(String data) {
		System.out.println(data);
	}
	public void print(int intData, String stringData) {
		System.out.println(intData);
		System.out.println(stringData);
		System.out.println(stringData + intData);
	}
	public void print(String stringData, int intData) {
		System.out.println(stringData + intData);
	}

}
