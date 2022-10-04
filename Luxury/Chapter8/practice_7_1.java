package Chapter8;
import java.io.*;
public class practice_7_1 {
	public static void main(String[] args) {
		File a = new File("C:\\Users\\kkm23\\eclipse-workspace\\Luxury\\Chapter8\\a.jpg");
		File b = new File("C:\\Users\\kkm23\\eclipse-workspace\\Luxury\\Chapter8\\b.jpg");
		
		try {
			FileInputStream fi = new FileInputStream(a);
			FileOutputStream fo = new FileOutputStream(b);
			
			byte[] buf = new byte[1024]; // 10kb크기의 버퍼
			
			int c;
			long cnt = 0, prg = a.length();
			System.out.println("10% 실행될때 마다 '*'이 출력됩니다.");
			while(true) {
				int n = fi.read(buf);
				fo.write(buf, 0, n);
				cnt++;
				if(cnt == prg/10) {
					System.out.print("*");
					cnt=0;
				}
				
				if(n < buf.length) {
					break;
				}
			}
			fi.close();
			fo.close();
		} catch(IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
