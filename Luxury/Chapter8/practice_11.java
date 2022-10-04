package Chapter8;
import java.util.*;
import java.io.*;
public class practice_11 {
	public static void main(String[] args) {
		Vector<String> word = new Vector<String>();
		Scanner sc;
		try {
			File f = new File("C:\\Users\\kkm23\\Desktop\\R\\words.txt");
			FileReader fr = new FileReader(f);
			sc = new Scanner(fr);
			while(sc.hasNext()) {
				String en = sc.next();
				word.add(en);
			}
			System.out.println(f.getParent() + " 디렉토리의 " + f.getName() + "파일을 읽었습니다..");
			sc.close();
			sc = new Scanner(System.in);
			
			while(true) {
				boolean find = false;
				System.out.print("단어 >> ");
				
				String input = sc.next();
				
				if(input.equals("그만")) {
					System.out.println("종료합니다.");
					break;
				}
				for(int i=0; i<word.size(); i++) {
					String w = word.get(i);
					if(w.length() < input.length()) continue;
					
					String sub = w.substring(0, input.length());
					if(sub.equals(input)) {
						System.out.println(w);
						find = true;
					}
				}
				if(find == false) System.out.println("발견할 수 없음.");
			}
			sc.close();
			fr.close();
			System.out.println("종료합니다...");
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}
}
