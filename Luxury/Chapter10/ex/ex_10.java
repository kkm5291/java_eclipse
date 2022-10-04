package Chapter10.ex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ex_10 extends JFrame {
	public ex_10() {
		setTitle("색깔놀이~");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addMouseWheelListener(new MyMouseListener());
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		public void mouseWheelMoved(MouseWheelEvent e) {
			
			int r = (int)(Math.random() * 256);
			int g = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);
			
			Component c = (Component)e.getSource();
			c.setBackground(new Color(r, g, b));
			
		}
	}
	
	public static void main(String[] args) {
		new ex_10();
	}
}
