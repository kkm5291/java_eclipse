package Chapter8;
import java.io.*;
public class practice_7 {
	public static void main(String[] args) {
		File src = new File("C:\\Users\\kkm23\\eclipse-workspace\\Luxury\\Chapter8\\img28.jpg");
		
		File dest = new File("C:\\Users\\kkm23\\eclipse-workspace\\Luxury\\Chapter8\\b.jpg");
		
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			System.out.println("이미지 복사 프로그램 실행 \r\n10%마다 *를 출력합니다.");
			
			int cnt = 0;
			long prg = src.length();
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
				cnt++;
				if(cnt == prg/10) {
					System.out.print("*");
					cnt=0;
				}
			}
			fi.close();
			fo.close();
			
		} catch(IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
