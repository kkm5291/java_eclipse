package Chapter3;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;


public class num_16{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = {"가위", "바위", "보"};
		String user;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			int n = (int)(Math.random()*3);
			System.out.print("가위 바위 보!>>");
			user = sc.next();
			String com = str[n];
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			
			if(com.equals(user)) {
				System.out.println("사용자 = "+user+" ,"+"컴퓨터 = "+com+", 비겼습니다.");
			} else {
				if(com.equals("가위")) {
					if(user.equals("바위")) {
						System.out.println("사용자 = "+user+" ,"+"컴퓨터 = "+com+ " 사용자가 이겼습니다.");
					}else {
						System.out.println("사용자 = "+user+" ,"+"컴퓨터 = "+com+ " 사용자가 졌습니다");
					}
				}
				else if(com.equals("바위")) {
					if(user.equals("보")) {
						System.out.println("사용자 = "+user+" ,"+"컴퓨터 = "+com+ " 사용자가 이겼습니다");
					} else {
						System.out.println("사용자 = "+user+" ,"+"컴퓨터 = "+com+ " 사용자가 졌습니다");
					}
				}
				else if(com.equals("보")) {
					if(user.equals("가위")) {
						System.out.println("사용자 = "+user+" ,"+"컴퓨터 = "+com+ " 사용자가 이겼습니다");
					} else {
						System.out.println("사용자 = "+user+" ,"+"컴퓨터 = "+com+ " 사용자가 졌습니다");
					}
				}		
			}
		}
	}
}
