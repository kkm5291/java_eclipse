package e.thread;

public class RunDaemonThread {
	public void runCommonThread() {
		DaemonThread thread = new DaemonThread();
//		thread.setDaemon(true);
		thread.start();
	}
	
	public static void main(String[] args) {
		RunDaemonThread sample = new RunDaemonThread();
		sample.runCommonThread();
	}
}
