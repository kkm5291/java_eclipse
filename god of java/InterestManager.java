
public class InterestManager {

	public static void main(String[] args) {
		InterestManager interest = new InterestManager();
		for (int day = 10; day <= 370; day+=10) {
			double amount = interest.calculateAmount(day, 1000000);
			System.out.println(day+":"+amount);
		}
	}
	public double getInterestRate(int day) {
		double rate;
		if (day <= 90) {
			rate = 1.005;
		} else if (day >= 91 && day <=180) {
			rate = 1.01;
		} else if (day >= 181 && day <= 364) {
			rate = 1.02;
		} else {
			rate = 1.056;
		}
		return rate;
	}
	public double calculateAmount(int day, long amount) {
		double sum;
		double rate = getInterestRate(day);
		sum = amount * rate;
		return sum;
	}

}
