package Chapter4;
import java.util.*;
class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	
	public void set(String work) {
		this.work = work;
		}
	
	public String get() { // get을 통해 할일을 받아냄
		return work;
	}
	
	public void show() {
		if(work == null) System.out.println("없습니다");
		else System.out.println(work + " 입니다.");
	}
}

class MonthSchedule {
	private Day[] days;
	private Scanner sc = new Scanner(System.in);
	public MonthSchedule(int a) {
		System.out.println("이번달 스케쥴 관리 프로그램");
		days = new Day[a];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
		
	}
	
	void input() {
		System.out.print("날짜(1~30)를 입력하세요. >> ");
		int day_count = sc.nextInt();
		System.out.print("할일(빈칸없이 입력해주세요.) >> ");
		String work = sc.next();
		days[day_count].set(work);
		System.out.println();
		
		
	}
	
	void view() {
		System.out.print("날짜(1~30)를 입력하세요. >> ");
		int view_count = sc.nextInt();
		System.out.print(view_count+"일의 할 일은 ");
		days[view_count].show();
		System.out.println();
	}
	
	void finish() {
		System.out.println("프로그램을 종료합니다.");
		return;
	}
	
	void run() {
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
			int input = sc.nextInt();
			if(input == 1) {
				input();
			} else if(input == 2) {
				view();
			} else if(input == 3) {
				finish();
				return;
			} else {
				System.out.println("유효하지 않은 입력값입니다. 다시입력하세요.");
			}	
		}
	}
}
public class practice_7 {
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}
