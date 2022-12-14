package Chapter13.ex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	public void run() {
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
public class ex_5 extends JFrame {
	private Thread th;
	public ex_5() {
		setTitle("예제 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable);
		c.add(timerLabel);
		
		JButton btn = new JButton("Kill Timer");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);
			}
		});
		
		c.add(btn);
		
		setSize(300, 300);
		setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		new ex_5();
	}
}
