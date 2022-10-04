package Chapter10.ex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ex_5 extends JFrame {
	private JLabel la = new JLabel("Hello");
	public ex_5() {
		setTitle("Mouseadapter 사용 예제");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		c.setLayout(null);
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}
	
	public static void main(String[] args) {
		new ex_5();
	}
}
