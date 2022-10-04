package Chapter8;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class main {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("C:\\test.out");
		byte [] b = {7, 51, 3, 4, -1, 24};
		fout.write(b);
		try {
			FileInputStream fin = new FileInputStream("C:\\test.out");
			
			byte [] read_b = new byte[6];
			fin.read(read_b);
			
			System.out.println("test.out의 배열을 출력합니다");
			
			for(int i=0; i<read_b.length; i++) {
				System.out.print(read_b[i] + " ");
			}
			System.out.println();
			
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류입니다.");
		}
		
	}
}
