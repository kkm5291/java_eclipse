package Chapter8.ex;
import java.io.*;
public class ex_11 {
	public static void main(String [] args) {
		File src = new File("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
		
		File dest = new File("C:\\Temp\\copyimg1.jpg");
		
		try {
			FileInputStream fin = new FileInputStream(src);
			FileOutputStream fout = new FileOutputStream(dest);
			byte[] buf = new byte[1024*10];
			
			while(true) {
				int n = fin.read(buf);
				fout.write(buf, 0, n);
				if(n<buf.length) break;
			}
			fin.close();
			fout.close();
			
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		
	}
}
