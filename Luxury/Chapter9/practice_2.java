package Chapter9;
import javax.swing.*;
import java.awt.*;
public class practice_2 extends JFrame {
	public practice_2() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 7));
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new practice_2();
	}
	
}
