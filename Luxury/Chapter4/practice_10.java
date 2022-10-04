package Chapter4;
import java.util.*;
class Dictionary {
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			for(int i=0; i<kor.length; i++) {	
				if(word.equals(kor[i])) {
					if(i%2 ==0) 
						System.out.print(word +"은 ");
					else
						System.out.print(word +"는 ");
					return eng[i];
				}
			}
			return "false";
		}
	}
}
public class practice_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한글 단어 검색 프로그램입니다.");
		String input;
		while(true) {
			System.out.print("한글 단어? ");
			input = sc.next();
			if(input.equals("그만")) {
				break;
			}
			String eng = Dictionary.kor2Eng(input);
			
			if(eng.equals("false")) 
				System.out.println(input +"은(는) 저의 사전에 없습니다.");
			else
				System.out.println(eng);
		}
		sc.close();
	}
}
