package Chapter13;
import java.awt.event.*;
import java.util.Calendar;
import java.awt.*;
import javax.swing.*;
public class practice_3 extends JFrame{
	public practice_3() {
		super("디지털 시계 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel la = new JLabel();
		la.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(la);
		
		setVisible(true);
		setSize(500, 400);
		
		MyThread th = new MyThread(la);
		th.start();
	}
	
	public static void main(String[] args) {
		new practice_3();
	}
}

class MyThread extends Thread {
	private JLabel la;
	
	public MyThread(JLabel la) {
		this.la = la;
	}
	
	@Override
	public void run() {
		while(true) {
			Calendar c = Calendar.getInstance();
			
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			String clockText = Integer.toString(hour);
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(min));
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(second));
			
			la.setText(clockText);
		}
	}
}


