package Chapter5;
class TV {
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}

class ColorTV {
	int a, b;
	public ColorTV() {}
	public ColorTV(int a, int b) {
		this.a=a;
		this.b=b;
	}
	void printProperty() {
		System.out.println(a +"인치 "+b+"컬러");
	}
}

class IPTV extends ColorTV {
	String a;
	int b, c;
	public IPTV(String a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void printProperty() {
		System.out.println("나의 IPTV는 "+a+" 주소의 "+b+"인치 "+c+"컬러");
	}
}
public class practice_1 {
	public static void main(String [] args) {
		IPTV  iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}

}
