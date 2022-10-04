package Chapter9;
import javax.swing.*;
import java.awt.*;
public class practice_5 extends JFrame {
	public practice_5() {
		setTitle("4x4 Color Frame");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));
		
		
		for(int i=0; i<16; i++) {
			Color[] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE,
					Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.WHITE,
					Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN};
			
			
			JLabel la = new JLabel(i+"");
			la.setBackground(col[i]);
			la.setOpaque(true);
			c.add(la);
		}
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new practice_5();
	}
}
