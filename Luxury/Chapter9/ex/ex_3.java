package Chapter9.ex;
import javax.swing.*;
import java.awt.*;
public class ex_3 extends JFrame {
	public ex_3() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		c.setBackground(Color.DARK_GRAY);
		c.add(new JButton("add"), BorderLayout.WEST);
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ex_3();
	}
}
