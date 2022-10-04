package Chapter10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class practice_1 extends JFrame {
	public practice_1() {
		setTitle("ggg");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel la = new JLabel("Love Java");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		la.addMouseListener(new MyMouseListener());
		c.add(la);
		
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			JLabel l = (JLabel)e.getSource();
			l.setText("사랑해");
		}
		
		public void mouseExited(MouseEvent e) {
			JLabel l = (JLabel)e.getSource();
			l.setText("Love Java");
		}
	}
	
	public static void main(String[] args) {
		new practice_1();
	}
}
