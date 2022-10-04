package Chapter7.ex;
import java.util.*;
public class ex_6 {
	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재윤", 70);
		scoreMap.put("한원선", 99);
		
		System.out.print("HashMap의 구성요소 : ");
		System.out.println(scoreMap.size());
		
		Set<String> keys = scoreMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int value = scoreMap.get(name);
			System.out.println(name + " : " + value);
		}
	}
}
