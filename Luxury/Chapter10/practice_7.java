package Chapter10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class practice_7 extends JFrame {
	public practice_7() {
		setTitle("마우스 휠을 굴려 폰트 크기 조절");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		c.add(la);
		la.addMouseWheelListener(new MouseAdapter() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				int size = la.getFont().getSize();
				
				if(n < 0) // 마우스 휠 위로
					size += 5;
				else // 마우스 휠 아래로
					size -= 5;
				
				if(size < 5)
					size = 5;
				
				la.setFont(new Font("Arial", Font.PLAIN, size));
			}
		});
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new practice_7();
	}
}
