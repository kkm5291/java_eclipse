package Chapter9;
import javax.swing.*;
import java.awt.*;
public class practice_4 extends JFrame {
	public practice_4() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JLabel j = new JLabel();
		c.setLayout(new GridLayout(1, 10));
		
		for(int i=0; i<10; i++) {
			Color[] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE,
					Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
			String text = Integer.toString(i);
			JButton b = new JButton(text);
			b.setBackground(col[i]);
			c.add(b);
		}
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new practice_4();
	}
}