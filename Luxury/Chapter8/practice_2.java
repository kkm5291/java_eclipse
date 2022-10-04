package Chapter8;
import java.io.*;

public class practice_2 {
	public static void main(String[] args) {
//		FileReader fin = null;
//		try {
//			fin = new FileReader("C:\\temp\\phone.txt");
//			
//			int c;
//			while((c = fin.read()) != -1) {
//				System.out.print((char)c);
//			}
//			fin.close();
//			
//		} catch(FileNotFoundException e) {
//			System.out.println("파일을 열 수 없음");
//		
//		} catch(IOException e) {
//			System.out.println("입출력 오류");
//		}
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\temp\\phone.txt");
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			fin.close();
			out.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
