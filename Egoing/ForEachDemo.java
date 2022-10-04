
public class ForEachDemo {

	public static void main(String[] args) {
		String[] members = { "최진혁", "최유빈", "한이람"};
//		for (String e : members) {
//			System.out.println(e + "이 상담을 받았습니다.");
			for(int i = 0; i<members.length;i++) {
				System.out.println(members[i]+"이 상담을 받았습니다");
		}
	}
}

