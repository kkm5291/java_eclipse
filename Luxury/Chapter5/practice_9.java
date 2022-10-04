package Chapter5;
import java.util.Scanner;
interface Stack {
	int length(); // 현재 원소값 개수 리턴
	int capacity(); // 배열 최대값 리턴
	String pop(); // 원소값 저장
	boolean push(String val); // 원소값 리턴
}

class StringStack implements Stack {
	public StringStack(int size) {
		this.size = size;
		stack = new String[size];
	}
	private int size;
	private int cnt = 0;
	private String[] stack;
	
	public int length() {
		// 현재 원소값 개수 리턴
		return cnt;
	}
	public int capacity() {
		// 배열 최대값 리턴
		return stack.length;
	}
	
	public String pop() {
		// 원소값 저장
		if(cnt == 0) {
			return "비어있음";
		} else {
			String pop = stack[cnt-1];
			cnt--;
			return pop;
		}
	}
	public boolean push(String val) {
		// 원소값 리턴
		if(size == cnt) {
			System.out.println("스택이 꽉 차서 푸시 불가!");
			return false;
		}
		stack[cnt] = val;
		cnt++;
		return true;
	}
}

public class practice_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = sc.nextInt();
		StringStack ss = new StringStack(size);
		while(true) {
			System.out.print("문자열 입력 >> ");
			String input = sc.next();
			if(input.equals("그만")) {
				break;
			}
			ss.push(input);
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for(int i=0; i<size; i++) {
			System.out.print(ss.pop() + " ");
		}
	}
}