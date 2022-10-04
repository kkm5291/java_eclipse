package Chapter9;
import javax.swing.*;
import java.awt.*;
public class practice_3 extends JFrame {
	public practice_3() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		
		for(int i=0; i<10; i++) {
			c.add(new JButton(Integer.toString(i)));
		}
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new practice_3();
	}
}
