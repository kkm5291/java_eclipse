package Chapter8;
import java.io.*;
import java.util.*;
public class practice_3 {
	public static void main(String[] args) {
		try {
//			fin = new FileReader("C:\\windows\\system.ini");
			File f = new File("C:\\windows\\system.ini");
			Scanner sc = new Scanner(new FileReader(f));
			while(sc.hasNext()) {
				String line = sc.nextLine();
				line = line.toUpperCase();
				System.out.println(line);
			}
			sc.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
