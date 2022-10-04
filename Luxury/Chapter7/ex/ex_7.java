package Chapter7.ex;
import java.util.*;
class Student {
	private int id;
	private String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	public int getId() {return id;}
	public String getTel() {return tel;}
}

public class ex_7 {
	public static void main(String[] args) {
		HashMap<String, Student> h = new HashMap<String, Student>();
		
		h.put("황기태", new Student(1, "010-111-1111"));
		h.put("이재문", new Student(2, "010-222-2222"));
		h.put("김남윤", new Student(3, "010-333-3333"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름 >> ");
			String name = sc.next();
			if(name.equals("exit")) { break; }
			Student st = h.get(name);
			if(st == null) {
				System.out.println(name + "은 없는사람입니다.");
			} else {
				System.out.println("Id : " + st.getId() + ", 전화 : " + st.getTel());
			}
		}
		sc.close();
			
	}
}
