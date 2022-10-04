package Chapter8.ex;
import java.io.*;
public class ex_9 {
	public static void main(String[] args) {
		File src = new File("C:\\windows\\system.ini");
		File dest = new File("C:\\Temp\\system.txt");
		
		int c;
		try{
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			
			fr.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
