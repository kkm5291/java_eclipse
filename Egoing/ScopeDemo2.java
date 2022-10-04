
public class ScopeDemo2 {
	static int i; // 정적변수 (전역변수)
	
	static void a() {
		int i = 0;
		System.out.println(i);
	}
	public static void main(String[] args) {
		for (i = 0; i < 5; i ++) {
			a();
			System.out.println(i);
		}

	}

}