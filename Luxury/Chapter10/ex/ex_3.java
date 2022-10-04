package Chapter10.ex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ex_3 extends JFrame {
	public ex_3() {
		setTitle("Action 이벤트 리스너 작성");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton jb = new JButton("Action");
		c.add(jb);
		
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				
				setTitle(b.getText());
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ex_3();
	}
}
