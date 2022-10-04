package Chapter10.ex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ex_7 extends JFrame {
	private JLabel la = new JLabel();
	public ex_7() {
		setTitle("Key Code 예제 : F1키:초록색, %키: 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+"키가입력되었음");
			if(e.getKeyChar() == '%')
				contentPane.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
			else
				contentPane.setBackground(Color.LIGHT_GRAY);
		}
	}
	
	public static void main(String[] args) {
		new ex_7();
	}
}
