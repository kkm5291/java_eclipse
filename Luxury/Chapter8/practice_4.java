package Chapter8;
import java.util.*;
import java.io.*;
public class practice_4 {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\windows\\system.ini");
			Scanner sc = new Scanner(new FileReader(f));
			int lineNumber = 1;
			System.out.println(f.getPath() + " 파일을 읽어 출력합니다.");
			while(sc.hasNext()) {
				String line = sc.nextLine();
				System.out.println("  " + lineNumber+": "+line);
				lineNumber++;
			}
			sc.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
