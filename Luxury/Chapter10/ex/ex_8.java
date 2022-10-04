package Chapter10.ex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex_8 extends JFrame {
	private JLabel la = new JLabel("Hello");
	
	public ex_8() {
		setTitle("8번 예제");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.setLayout(null);
		la.setLocation(50, 50);
		la.setSize(100, 20);
				
		c.add(la);
		
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
			
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - 10); break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + 10); break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - 10, la.getY()); break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + 10, la.getY()); break;
			}
		}
	}
	
	public static void main(String[] args) {
		new ex_8();
	}
}
