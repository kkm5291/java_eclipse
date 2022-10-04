
public class MethodDemo {

	public static void main(String[] args) {
		numbering();
		numbering();
		numbering();
		numbering();//호출

	}
	public static void numbering() { //메소드의 정의
		int i=0;
		while (i<10) {
			System.out.println(i);
			i++;
		}
	}

}
