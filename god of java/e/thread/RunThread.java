package e.thread;

public class RunThread {
	public static void main(String[] args) {
		RunThread threads = new RunThread();
		threads.runBasic();
	}
	
	public void runBasic() {
		RunnableSample runnable = new RunnableSample();
		new Thread(runnable).start();
		
		ThreadSample thread = new ThreadSample();
		thread.start();
		
		System.out.println("RunThread.runBasic() method is ended.");
	}
}
