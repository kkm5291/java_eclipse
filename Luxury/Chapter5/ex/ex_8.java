package Chapter5.ex;
interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface {
	@Override
	public void sendCall() {
		System.out.println("Ring Ring");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("Calling");
	}
	
	public void flash() {
		System.out.println("Phone On");
	}
}
public class ex_8 {
	public static void main(String[] args) {
		SamsungPhone sp = new SamsungPhone();
		sp.printLogo();
		sp.sendCall();
		sp.receiveCall();
		sp.flash();
	}
}
