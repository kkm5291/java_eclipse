package e.thread.object;

public class RunObjectThreads {
	public static void main(String[] args) {
		RunObjectThreads thread = new RunObjectThreads();
		thread.checkThreadState3();
	}
	
	public void checkThreadState2() {
		Object monitor = new Object();
		StateThread thread = new StateThread(monitor);
		try {
			System.out.println("thread state = " +thread.getState()); // new
			thread.start();
			System.out.println("thread stat(after start)="+thread.getState()); // runnable
			
			Thread.sleep(100);
			System.out.println("thread state(after 0.1sec)="+thread.getState()); // waiting
			
			synchronized(monitor) {
				monitor.notify();
			}
			Thread.sleep(100);
			System.out.println("thread state(after notify)="+thread.getState()); // timed_waiting
			
			thread.join();
			System.out.println("thread state(after join)="+thread.getState());
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void checkThreadState3() {
		Object monitor = new Object();
		StateThread thread = new StateThread(monitor);
		StateThread thread2 = new StateThread(monitor);
		try {
			System.out.println("thread state = " +thread.getState()); // new
			thread.start();
			thread2.start();
			System.out.println("thread stat(after start)="+thread.getState()); // runnable
			
			Thread.sleep(100);
			System.out.println("thread state(after 0.1sec)="+thread.getState()); // waiting
			
			synchronized(monitor) {
				monitor.notify();
			}
			Thread.sleep(100);
			System.out.println("thread state(after notify)="+thread.getState()); // timed_waiting
			
			thread.join();
			System.out.println("thread state(after join)="+thread.getState());
			thread2.join();
			System.out.println("thread2 state(after join)="+thread.getState());
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
