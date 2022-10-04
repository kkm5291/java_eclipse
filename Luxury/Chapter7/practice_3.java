package Chapter7;
import java.util.*;
public class practice_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("enter nations name, population");
		String k;
		int v;
		while(true) {
			System.out.print("Nation's name, population >>");
			k = sc.next();
			if(k.equals("그만")) {
				break;
			}
			v = sc.nextInt();
			nations.put(k, v);
		}
		while(true) {
			System.out.print("Search nation name >> ");
			String search = sc.next();
			if(search.equals("그만")) {
				break;
			}
			Integer pop = nations.get(search);
			if(pop == null) {
				System.out.println(search + "나라는 없습니다.");
			} else {
				System.out.println(search + "의 인구는 " + pop);
			}
			
		}
		sc.close();
	}
}
