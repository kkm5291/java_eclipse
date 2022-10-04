package Chapter7;
import java.util.*;
public class practice_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Location[] location = new Location[4];
		HashMap<String, Location> hm = new HashMap<String, Location>();
		System.out.println("도시, 경도, 위도를 입력하세요.");
		
		for(int i=0; i<location.length; i++) {
//			System.out.print(">>> ");
			String info = sc.nextLine();
			StringTokenizer st = new StringTokenizer(info, ", ");
			String name = st.nextToken().trim();
			String longitude = st.nextToken().trim();
			String latitude = st.nextToken().trim();
			
			location[i] = new Location(name, longitude, latitude); // location 객체만들기
			// 이제 해쉬맵에 넣어줄 것임
			hm.put(name, location[i]);
		}
		// key값을 key객체에 집합으로 넣어주고
		Set<String> key = hm.keySet(); // name 녀석들임 키값
		// 반복 돌려버려
		Iterator<String> it = key.iterator();
		System.out.println("--------------------------");
		while(it.hasNext()) {
			String name = it.next();
			Location l = hm.get(name); // l이라는 location 객체에 
			// value값 받기
			System.out.println(l);
		}
		System.out.println("--------------------------");
		
		while(true) {
			System.out.print("도시 이름 >> ");
			String input = sc.next();
			if(input.equals("그만")) {break;}
			
			Location l = hm.get(input);
			if(l == null)
				System.out.println(input + "은 없습니다.");
			else
				System.out.println(l);
		}
		
	}
}

class Location {
	String name, longitude, latitude;
	
	public Location(String name, String longitude, String latitude) {
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public String toString() {
		return name + "\t" + longitude+ "\t"  + latitude;
	}
	
	public void findLocation(String input) {
		if(input == null) {
			System.out.println(input + "는 없는단어입니다.");
		} else {
			System.out.println(toString());
		}
	}
	
}
