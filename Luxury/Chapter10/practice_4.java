package Chapter10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class practice_4 extends JFrame {
	public practice_4() {
		setTitle("Left 키로 문자열 이동");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel la = new JLabel("Love Java");
		c.add(la);
		c.setFocusable(true);
		c.requestFocus();
		c.addKeyListener(new KeyAdapter() {	
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					String text = la.getText();
					la.setText(text.substring(1) + text.substring(0,1));
				}
			}
		});
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new practice_4();
	}
}
