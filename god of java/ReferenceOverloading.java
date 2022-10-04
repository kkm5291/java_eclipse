
public class ReferenceOverloading {

	public static void main(String[] args) {
		ReferenceOverloading reference = new ReferenceOverloading(); // 객체를 생성하는 일
		reference.print(20);
		reference.print("Hi");
		reference.print(20, "Fuck you");
		reference.print("오지원과 대화를 어떻게 해야할까?", 20);
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
