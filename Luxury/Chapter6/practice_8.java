package Chapter6;
import java.util.Scanner;
public class practice_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		
		String str = sc.nextLine();
		
		for(int i=1; i<=str.length(); i++) {
			System.out.println(str.substring(i));
//			System.out.println(str.substring(0, i));
		}
	}
}
