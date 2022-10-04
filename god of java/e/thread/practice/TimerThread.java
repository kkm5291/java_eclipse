package e.thread.practice;
import java.util.Date;
public class TimerThread extends Thread{
	@Override
	public void run() {
		printCurrentTime();
	}
	public void printCurrentTime() {
		Date date = new Date();
		try {
			int count=0;
			while(count < 10) {
				Thread.sleep(1000);
				long currentTime=System.currentTimeMillis();
				System.out.println(new Date(currentTime) + " " + currentTime);
				count++;
			}			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
