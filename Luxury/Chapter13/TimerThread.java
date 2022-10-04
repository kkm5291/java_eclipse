package Chapter13;

public class TimerThread extends Thread {
	private int n=0;
	private boolean flag = false;
	public void finish() {flag = true;}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
				if(flag == true) {
					return;
				}
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		TimerThread th = new TimerThread();
		th.start();
		
		th.finish();
	}
}
