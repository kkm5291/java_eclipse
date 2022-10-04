package Chapter8;
import java.io.*;
import java.util.*;
public class practice_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			FileWriter fout = new FileWriter("C:\\temp\\phone.txt");
			System.out.println("전화번호 입력 프로그램 입니다.");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String input = sc.nextLine();
				if(input.equals("그만")) {
					break;
				}
				fout.write(input + "\r\n");
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력오류");
		}
		
	}
}
