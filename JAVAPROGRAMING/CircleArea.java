import java.util.Scanner;
public class CircleArea {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		
		String c_str, y_str;
		
		System.out.print("철수 >> ");
		c_str = sc.next();
		System.out.print("영희 >> ");
		y_str = sc.next();
		
		sc.close();
		if(c_str.equals("가위")) {
			if(y_str.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}else if(y_str.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}
		} else if(c_str.equals("바위")) {
			if(y_str.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}else if(y_str.equals("보")) {
				System.out.println("영희가 이겼습니다.");
				
			}
		} else if(c_str.equals("보")) {
			if(y_str.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}else if(y_str.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}
		} else if(c_str.equals(y_str)) {
			System.out.println("비겼습니다.");
		}
		
		
	}
}
