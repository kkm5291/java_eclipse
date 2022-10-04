package Chapter9;
import javax.swing.*;
import java.awt.*;
public class practice_8 extends JFrame {
	public practice_8() {
		setTitle("여러 개의 패널을 가진 프레임");
		setSize(400, 400);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new North(), BorderLayout.NORTH);
		c.add(new Center(), BorderLayout.CENTER);
		c.add(new South(), BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	
	
	
	class North extends JPanel {
		public North() {
			setLayout(new FlowLayout());
			add(new JButton("열기"));
			add(new JButton("닫기"));
			add(new JButton("나가기"));
			setBackground(Color.DARK_GRAY);
		}
	}
	class Center extends JPanel {
		public Center() {
			setLayout(null);
			
			for(int i=0; i<10; i++) {
				int x = (int)(Math.random()*250);
				int y = (int)(Math.random()*150);
				JLabel la = new JLabel("*");
				
				la.setOpaque(true);
				la.setSize(20,20);
				la.setLocation(x, y);
				la.setForeground(Color.red);
				add(la);
			}
		}
	}
	class South extends JPanel {
		public South() {
			setLayout(new FlowLayout());
			setBackground(Color.yellow);
			add(new JButton("Word Input"));
			add(new JTextField(18));
		}
	}
	
	public static void main(String[] args) {
		new practice_8();
	}
}
