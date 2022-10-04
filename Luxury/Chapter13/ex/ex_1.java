package Chapter13.ex;
import java.awt.*;
import javax.swing.*;
public class ex_1 extends JFrame {
	public ex_1() {
		setTitle("Thread를 상속받은 타이머");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel();
		la.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(la);
		
		TimerThread th = new TimerThread(la);
		
		setSize(300, 300);
		setVisible(true);
		
		th.start();
		
	}
	
	class TimerThread extends Thread {
		private JLabel la;
		
		public TimerThread(JLabel la) {
			this.la = la;
		}
		
		@Override
		public void run() {
			int n = 0;
			while(true) {
				la.setText(Integer.toString(n));
				
				n++;
				try {
					sleep(1000);
				}
				catch(InterruptedException e) {return;}
			}
		}
	}
	
	public static void main(String[] args) {
		new ex_1();
	}
}
