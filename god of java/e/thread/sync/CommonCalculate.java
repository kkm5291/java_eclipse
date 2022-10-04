package e.thread.sync;

public class CommonCalculate {
	private int amount;
	private int interest;
	Object interestLock = new Object();
	Object amountLock = new Object();
	public CommonCalculate() {
		amount=0;
	}
	
	public void addInterest(int value) {
		synchronized(interestLock) {
			interest+=value;			
		}
	}
	
	public void plus(int value) {
		synchronized(amountLock) {
			amount+=value;			
		}
	}
	
	public void minus(int value) {
		amount-=value;
		
	}
	public int getAmount() {
		return amount;
	}
}
