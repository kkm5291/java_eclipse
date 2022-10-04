package e.thread;

public class ThreadJoin {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "Start");
		Runnable r = new MyRunnable();
		Thread thread = new Thread(r);
		thread.start();
		try {
			thread.join();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + "End");
		
	}
}


class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		System.out.println("쓰레드 1단계");
		thread2();
	}
	
	public void thread2() {
		System.out.println("쓰레드 2단계");
		thread3();
	}
	
	public void thread3() {
		System.out.println("쓰레드 3단계");
	}
}