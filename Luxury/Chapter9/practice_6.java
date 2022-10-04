package Chapter9;
import javax.swing.*;
import java.awt.*;
public class practice_6 extends JFrame {
	public practice_6() {
		setTitle("Random Lable");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);
		
		for(int i=0; i<20; i++) {
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			JLabel la = new JLabel();
			la.setBackground(Color.blue);
			la.setOpaque(true);
			la.setSize(10, 10);
			la.setLocation(x, y); // 배치관리자가 없으므로 위치도 직접 지정해줄 것
			
			
			c.add(la);
			
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		new practice_6();
	}
}
