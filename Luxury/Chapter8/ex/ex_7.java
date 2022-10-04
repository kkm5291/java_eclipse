package Chapter8.ex;
import java.util.*;
import java.io.*;
public class ex_7 {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 8);
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			
			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
		} catch (IOException e) {
			System.out.println("입출력 오류입니다.");
			e.printStackTrace();
		}
	}
}
