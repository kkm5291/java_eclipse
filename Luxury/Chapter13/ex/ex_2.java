package Chapter13.ex;
import java.awt.*;
import javax.swing.*;
public class ex_2 extends JFrame {
	public ex_2() {
		setTitle("Runnable 구현한 Timer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel();
		la.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		c.add(la);
		
		TimerRunnable tr = new TimerRunnable(la);
		Thread th = new Thread(tr);
		
		setVisible(true);
		
		th.start();
		
	}
	
	class TimerRunnable implements Runnable {
		private JLabel la;
		
		public TimerRunnable(JLabel la) {
			this.la = la;
		}
		
		@Override
		public void run() {
			int n = 0;
			while(true) {
				la.setText(Integer.toString(n));
				
				n++;
				
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e) {return;}
				
			}
		}
	}
	
	public static void main(String[] args) {
		new ex_2();
	}
}
