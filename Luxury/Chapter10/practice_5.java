package Chapter10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class practice_5 extends JFrame {
	public practice_5() {
		setTitle("+,-키로 크기조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		c.add(la);
		
		c.setFocusable(true);
		c.requestFocus();
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				
				Font f = la.getFont();
				int size = f.getSize();
				
				if(e.getKeyCode() == KeyEvent.VK_UP) 
					size += 5;
				else if(e.getKeyCode() == KeyEvent.VK_MINUS)
					size -= 5;
					if(size < 5) size = 5;
				
				la.setFont(new Font("Arial", Font.PLAIN, size));
				
			}
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new practice_5();
	}
}
