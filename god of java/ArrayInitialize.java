
public class ArrayInitialize {
	String [] month = {"January", "Febrary", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December"};

	public static void main(String[] args) {
		ArrayInitialize array = new ArrayInitialize();
		System.out.println(array.getMonth(12));

	}
	public void otherInit() {
		int [] lottoNumbers = {5,12,23,24,36,42,2};
	}
	public String getMonth(int monthInt) {
		return month[monthInt-1];
	}
}
