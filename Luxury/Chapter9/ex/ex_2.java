package Chapter9.ex;
import javax.swing.*;
import java.awt.*;
public class ex_2 extends JFrame {
	public ex_2() {
		setTitle("ContentPane 과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우 닫으면 프로그램 종료
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ex_2();
	}
}
