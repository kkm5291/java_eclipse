package Chapter4;
import java.util.Scanner;

/*
 * 1. main메소드 전체적 틀 구현하기
 * 2. S,A,B 좌석 만들기
 * 3. 예약 기능 구현하기
 */

public class practice_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConcertSeat cs = new ConcertSeat();
		System.out.println("명품콘서트 예약 시스템입니다.");
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				cs.reservation();
				break;
			case 2:
				cs.show_all();
				break;
			case 3:
				cs.delete_seat();
				break;
			}
			if(select == 4) {
				break;
			}
		}
	}
}

class ConcertSeat { // 좌석 설정, 현재좌석 보여주기
	Scanner sc = new Scanner(System.in);
	private String S[];
	private String A[];
	private String B[];
	
	public ConcertSeat() {
		S = new String[10];
		A = new String[10];
		B = new String[10];
		
		for(int i=0; i<10; i++) {
			S[i] = "---";
			A[i] = "---";
			B[i] = "---";
		}
	}
	
	void show(String seat[]) {
		for(int i=0; i<10; i++) {
			System.out.print(seat[i] + " ");
		}
		System.out.println();
	}
	
	void reservation() {
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.print("S>> ");
			show(S);
			inputSeat(S);
			break;
		case 2:
			System.out.print("A>> ");
			show(A);
			inputSeat(A);
			break;
		case 3:
			System.out.print("B>> ");
			show(B);
			inputSeat(B);
			break;
		}
	}
	
	void inputSeat(String seat[]) {
		System.out.print("이름 >> ");
		String insert = sc.next();
		System.out.print("번호 >> ");
		int num = sc.nextInt() - 1;
		
		seat[num] = insert;
	}
	
	void show_all() {
		System.out.print("S>> ");
		show(S);
		System.out.print("A>> ");
		show(A);
		System.out.print("B>> ");
		show(B);
		
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	void delete_seat() {
		System.out.print("좌석 S(1), A(2), B(3) >> ");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.print("S>> ");
			show(S);
			delete(S);
			break;
		case 2:
			System.out.print("A>> ");
			show(A);
			delete(A);
			break;
		case 3:
			System.out.print("B>> ");
			show(B);
			delete(B);
			break;
		}
	}
	
	void delete(String seat[]) {
		System.out.print("이름 >> ");
		String name = sc.next();
		for(int i=0; i<10; i++) {
			if(name.equals(seat[i])) {
				seat[i] = "---";
				break;
			}
		}
	}
	
	
	
}

