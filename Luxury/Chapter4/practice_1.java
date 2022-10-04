package Chapter4;
class TV {
	String name;
	int year;
	int inch;
	
	public TV(String name, int year, int inch) {
		this.name = name;
		this.inch = inch;
		this.year = year;
	}
	
	public void show() {
		System.out.println(name+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
}

public class practice_1 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
