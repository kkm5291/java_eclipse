package Chapter7;
import java.util.*;
class Student {
	Scanner sc = new Scanner(System.in);
	String name, dept;
	String num;
	String score;
	public Student(String name, String dept, String num, String score) {
		this.name = name;
		this.dept = dept;
		this.num = num;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String getNum() {
		return num;
	}
	public String getScore() {
		return score;
	}
	public void Find(String student) {
		if(student.equals(this.name)) {
			System.out.println(this.name + "," + this.dept + "," + this.num + "," + this.score);
		}
	}
	
}
public class practice_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student [] arr = new Student[4];
		ArrayList<Student> al = new ArrayList<Student>();
		HashMap<String, Student> hm = new HashMap<String, Student>();
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
	
		for(int i=0; i<arr.length; i++) {
			System.out.print(">> ");
			String info = sc.nextLine();
			StringTokenizer st = new StringTokenizer(info, ",");
			String name = st.nextToken().trim();
			String dept = st.nextToken().trim();
			String num = st.nextToken().trim();
			String score = st.nextToken().trim();
			arr[i] = new Student(name, dept, num, score);
//			al.add(arr[i]); // 객체들 al에 저장시킴
			hm.put(name, arr[i]);
		}
		
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("--------------------------");
//			Student s = al.get(i);
			Student s = hm.get(name);
			System.out.println("이름:" + s.getName());
			System.out.println("학과:" + s.getDept());
			System.out.println("학번:" + s.getNum());
			System.out.println("학점평균:" + s.getScore());
		}
		System.out.println("--------------------------");
		
		 
		while(true) {
			System.out.print("학생 이름 >> ");
			String input = sc.next();
			if(input.equals("그만")) {
				break;
			}
			Student s = hm.get(input);
			s.Find(input);
		}
	}
}
