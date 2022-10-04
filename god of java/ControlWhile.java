
public class ControlWhile {

	public static void main(String[] args) {
		ControlWhile control = new ControlWhile();
		control.whileContinue();

	}
	public void whileLoop1() {
		ControlofFlow control = new ControlofFlow();
		int loop = 0;
		while (loop < 12) {
			loop++;
			control.switchCalendar(loop);
		}
	}
	public void whileLoop2() {
		ControlofFlow control = new ControlofFlow();
		int loop = 0;
		while (loop <12) {
			loop++;
			control.switchCalendar(loop);
			if(loop == 6) break;
		}
	}
	public void whileContinue() {
		ControlofFlow control = new ControlofFlow();
		int loop = 0;
		while(loop < 12) {
			loop++;
			if(loop == 6) continue;
			control.switchCalendar(loop);
		}
	}
	public void whileContinueInfit() {
		ControlofFlow control = new ControlofFlow();
		int loop = 0;
		while(loop < 12) {
			if(loop == 6) continue;
			loop++;
			control.switchCalendar(loop);
		}
	}
}
