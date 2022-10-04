package Chapter9;
import javax.swing.*;
import java.awt.*;
public class practice_7 extends JFrame {
	public practice_7() {
		setTitle("계산기 프레임");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new practice_7();
	}
	
	class NorthPanel extends JPanel {
		public NorthPanel() {
			setBackground(Color.LIGHT_GRAY);
			setLayout(new FlowLayout());
			add(new JLabel("수식입력"));
			add(new JTextField(18));
		}
	}
	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(new GridLayout(4,4,2,2));
			for(int i=0; i<10; i++) {
				add(new JButton(Integer.toString(i)));
			}
			add(new JButton("CE"));
			add(new JButton("계산"));
			
			JButton [] jb = {new JButton("+"), new JButton("-"),
					new JButton("X"), new JButton("/")};
			
			for(int i=0; i<4; i++) {
				add(jb[i]);
				jb[i].setBackground(Color.CYAN);
				add(jb[i]);
			}
		}
	}
	
	class SouthPanel extends JPanel {
		public SouthPanel() {
			setLayout(new FlowLayout());
			add(new JLabel("계산 결과"));
			add(new JTextField(18));
			setBackground(Color.yellow);
		}
	}
}
