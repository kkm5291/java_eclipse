package Chapter8;
import java.io.*;
import java.util.*;
public class practice_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		File dest = new File("C:\\temp\\appended.txt");
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일을 프로젝트 폴더에 있어야 합니다");
		
		System.out.print("첫번째 파일 이름(경로)을 입력하세요 >> ");
		String f1 = sc.nextLine();
		
		System.out.print("두번째 파일 이름(경로)을 입력하세요 >>");
		String f2 = sc.nextLine();
		
		int c1, c2;
		try {
			FileReader fr_1 = new FileReader(f1);
			FileReader fr_2 = new FileReader(f2);
			FileWriter fw = new FileWriter(dest);
			while((c1 = fr_1.read()) != -1) {
				fw.write(c1);
			}
			
			fw.write("\r\n");
			
			while((c2 = fr_2.read()) != -1) {
				fw.write(c2);
			}
			
			fr_1.close();
			fr_2.close();
			fw.close();
			System.out.println("");
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
