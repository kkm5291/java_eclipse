package Chapter8.ex;
import java.io.*;
public class ex_1 {
	public static void main(String[] args) throws IOException {
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\windows\\system.ini");
			int c = fin.read();
			while ((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
