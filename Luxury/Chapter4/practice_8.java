package Chapter4;

import java.util.Scanner;

class Phone {
	String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name; this.tel = tel;
	}
	
}

public class practice_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phone[] phone;
		
		System.out.print("인원수 >> ");
		int num = sc.nextInt();
		phone = new Phone[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
			String name = sc.next();
			String tel = sc.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			int i;
			System.out.print("검색할 이름 >> ");
			String search = sc.next();
			for(i=0; i<num; i++) {
				if(search.equals(phone[i].name)) {
					System.out.println(phone[i].name + "의 번호는 " + phone[i].tel);
					i=0;
					break;
				}
			}
			
			if(i==num) {
				System.out.println(search + "이 없습니다.");
			}
			
			
			
			
			
			if(search.equals("그만")) {
				break;
			}
		}
	}
}