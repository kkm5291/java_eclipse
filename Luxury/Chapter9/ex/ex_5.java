package Chapter9.ex;
import javax.swing.*;
import java.awt.*;
public class ex_5 extends JFrame {
	public ex_5() {
		setTitle("GrideLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout g = new GridLayout(4, 2);
		Container c = getContentPane();
		
		c.setLayout(g);
		g.setVgap(5);
		
		c.add(new JLabel(" 이름")); // 미관때문에 한칸 띈것
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ex_5();
	}
}
