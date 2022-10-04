package NotePad;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class NotePad extends JFrame{
	//멤버 변수
	public JTextArea ta = new JTextArea();
	JFileChooser chooser = new JFileChooser();
	JMenuBar mb = new JMenuBar();
	
	public NotePad() {
		setTitle("Note Pad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);

		String[] smenu = {"파일"};
		JMenu[] mfile = new JMenu[10];
		for(int i=0; i<smenu.length; i++) {
			mfile[i] = new JMenu(smenu[i]);
			mb.add(mfile[i]);
		}
		
		String[] ScrItem = {"새파일", "열기", "저장", "다른이름으로 저장", "종료"};
		JMenuItem[] item = new JMenuItem[5];
		for(int i=0; i<ScrItem.length; i++) {
			item[i] = new JMenuItem(ScrItem[i]);
			this.setJMenuBar(mb);
			mfile[0].add(item[i]);
		}
		
		this.add(ta);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NotePad();
	}
}
