package Chapter13;
import java.util.*;
public class practice_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무 키나 입력 >> ");
		sc.nextLine();
		
		CountRunnable runnable = new CountRunnable();
		Thread th = new Thread(runnable);
		th.start();
		
	}
}

class CountRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("스레드 실행 시작");
		for(int i=1; i<11; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n스레드 종료");
	}
}
