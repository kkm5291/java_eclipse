package Chapter9.ex;
import javax.swing.*;
import java.awt.*;
public class ex_checktime_1 extends JFrame{
	public ex_checktime_1() {
		setTitle("CheckTime");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.CYAN);
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		contentPane.add(new JButton("HELLO"));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ex_checktime_1 test = new ex_checktime_1();
	}
}
