import java.util.Scanner;
public class CircleArea {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		
		String c_str, y_str;
		
		System.out.print("ö�� >> ");
		c_str = sc.next();
		System.out.print("���� >> ");
		y_str = sc.next();
		
		sc.close();
		if(c_str.equals("����")) {
			if(y_str.equals("��")) {
				System.out.println("ö���� �̰���ϴ�.");
			}else if(y_str.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}
		} else if(c_str.equals("����")) {
			if(y_str.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}else if(y_str.equals("��")) {
				System.out.println("���� �̰���ϴ�.");
				
			}
		} else if(c_str.equals("��")) {
			if(y_str.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}else if(y_str.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
		} else if(c_str.equals(y_str)) {
			System.out.println("�����ϴ�.");
		}
		
		
	}
}
