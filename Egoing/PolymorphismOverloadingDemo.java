
public class PolymorphismOverloadingDemo {

	class O{
		public void a(int param) {
			System.out.println("숫자출력");
			System.out.println(param);
		}
		
		public void a(String param) {
			System.out.println("문자출력");
			System.out.println(param);
		}
	}
	public static void main(String[] args) {
		
	}

}
