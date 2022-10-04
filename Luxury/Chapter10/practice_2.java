package Chapter10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class practice_2 extends JFrame {
	public practice_2() {
		setTitle("드래깅 동안 Yellow");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GREEN);
		
		c.addMouseListener(new MyMouseListener());
		c.addMouseMotionListener(new MyMouseMotionListener());
		
		
		setVisible(true);
	}
	
	public class MyMouseMotionListener extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.yellow);
		}
	}
	
	public class MyMouseListener extends MouseAdapter {
		public void mouseReleased(MouseEvent e) {
			Container c = (Container)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String[] args) {
		new practice_2();
	}
}
