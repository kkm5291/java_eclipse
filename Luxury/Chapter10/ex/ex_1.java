package Chapter10.ex;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex_1 extends JFrame {
	public ex_1() {
		setTitle("Action 이벤트 리스너 예제");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton jb = new JButton("Action");
		jb.addActionListener(new MyActionListener());
		
		c.add(jb);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex_1();
	}
}

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
				b.setText("액션");
		else
			b.setText("Action");
	}
}
