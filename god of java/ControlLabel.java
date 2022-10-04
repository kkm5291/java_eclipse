
public class ControlLabel {

	public static void main(String[] args) {
		ControlLabel control = new ControlLabel();
		control.printTimesTableSkipAfter4Case2();

	}
	public void printTimesTable() {
		for (int x=2; x<=9; x++) {
			if (x==4) continue;
			for (int y=1; y<=9; y++) {
				if (y==4) break;
				System.out.print(x+"*"+y+"="+x*y+" ");
			}
			System.out.println("");
		}
	}
	public void printTimesTableSkipAfter4Case2() {
		startLabel:
		for (int x=2; x<=9; x++) {
			if (x==4) continue;
			for (int y=1; y<=9; y++) {
				if (y==4) continue startLabel;
				System.out.print(x+"*"+y+"="+x*y+" ");
			}
			System.out.println("");
		}
	}

}
