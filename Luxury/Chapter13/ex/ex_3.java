package Chapter13.ex;
import java.awt.*;
import javax.swing.*;
class FlickeringLabel extends JLabel implements Runnable{
	private long delay;
	
	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		int timer = 0;
		int n = 0;
		while(true) {
			if(n==0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.green);
			
			if(n==0) n=1;
			else n=0;
			
			timer++;
			try {
				Thread.sleep(delay);
			}
			catch(InterruptedException e) {return;}
		}
	}
	
	
}
public class ex_3 extends JFrame{
	public ex_3() {
		setTitle("깜빡스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("빠른 깜빡", 5);
		
		JLabel la = new JLabel();
		
		FlickeringLabel fLabel2 = new FlickeringLabel("깜빡", 300);
		
		c.add(fLabel);
		c.add(la);
		c.add(fLabel2);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ex_3();
	}
}
