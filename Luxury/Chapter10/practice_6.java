package Chapter10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class practice_6 extends JFrame {
	public practice_6() {
		setTitle("클릭 연습 용 응용프로그램");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("C");
		la.setLocation(100, 100);
		la.setSize(100, 100);
		
		la.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				int x = (int)(Math.random()*250);
				int y = (int)(Math.random()*250);
				
				la.setLocation(x, y);
			}
		});

		c.add(la);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new practice_6();
	}
}
