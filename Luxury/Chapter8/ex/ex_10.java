package Chapter8.ex;
import java.io.*;
public class ex_10 {
	public static void main(String [] args) {
		File src = new File("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
		
		File dest = new File("C:\\Temp\\copyimg.jpg");
		
		int c;
		try {
			FileInputStream fin = new FileInputStream(src);
			FileOutputStream fout = new FileOutputStream(dest);
			
			while((c = fin.read()) != -1) {
				fout.write((byte)c);
			}
			fin.close();
			fout.close();
			
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		
	}
}
