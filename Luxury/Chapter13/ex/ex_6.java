package Chapter13.ex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ex_6 extends JFrame {
	private RandomThread th;
	public ex_6() {
		setTitle("예제 6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				th.finish();
			}
		});
		
		setVisible(true);
		
		th = new RandomThread(c);
		th.start();
	}
	
	public static void main(String[] args) {
		new ex_6();
	}
}

class RandomThread extends Thread {
	private Container contentPane;
	private boolean flag = false;
	
	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	public void finish() {
		flag = true;
	}
	
	@Override
	public void run() {
		while(true) {
			int x = (int)(Math.random()*contentPane.getWidth());
			int y = (int)(Math.random()*contentPane.getHeight());
			
			JLabel la = new JLabel("java");
			la.setSize(80, 30);
			la.setLocation(x, y);
			contentPane.add(la);
			contentPane.repaint();
			try {
				Thread.sleep(300);
				if(flag==true) {
					contentPane.removeAll();
					la = new JLabel("Finish");
					la.setSize(80, 30);
					la.setLocation(150, 150);
					
					la.setForeground(Color.red);
					contentPane.add(la);
					contentPane.repaint();
					return;
				}
			}
			catch(InterruptedException e) {return;}
		}
	}
}
