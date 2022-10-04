
public class ControlSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlSwitch control = new ControlSwitch();
		control.switchStatement2(1);
		
	}
	public void switchStatement(int numberOfWheel) {
		switch (numberOfWheel) {
		case 1:
			System.out.println(numberOfWheel+":It is one foot bicycle");
			break;
		
		case 2:
			System.out.println(numberOfWheel+":It is a motor cycle or bicycle");
			break;
			
		case 3:
			System.out.println(numberOfWheel+":It is a three wheel car");
			break;
			
		case 4:
			System.out.println(numberOfWheel+":It is a car");
			break;
			
		default:
			System.out.println(numberOfWheel+":It is an expensive car");
			break;
		}
	}
	public void switchStatement2(int numberOfWheel) {
		switch (numberOfWheel) {
		case 1:
			System.out.println(numberOfWheel+":It is one foot bicycle");
			//break;
		
		case 2:
			System.out.println(numberOfWheel+":It is a motor cycle or bicycle");
			//break;
			
		case 3:
			System.out.println(numberOfWheel+":It is a three wheel car");
			break;
			
		case 4:
			System.out.println(numberOfWheel+":It is a car");
			break;
			
		default:
			System.out.println(numberOfWheel+":It is an expensive car");
			break;
		}
	}
}
