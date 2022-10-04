public class SalaryManager {
	
	public static void main(String[] args) {
		SalaryManager manager = new SalaryManager();
		
		
		System.out.println(manager.getMonthlySalary(20000000));
	}
	
	public double getMonthlySalary(int yearlySalary) {
		double monthSalary = yearlySalary / 12.0;
		
		double tax = calculateTax(monthSalary);
		double pension = calculateNationalPension(monthSalary);
		double insurance = calculateHealthInsurance(monthSalary);
		
		double taxSum = tax + pension + insurance;
		
		monthSalary -= taxSum;
		
		return monthSalary;
	}
	
	public double calculateTax(double monthSalary) {
		
		return monthSalary * 0.125;
	}
	
	public double calculateNationalPension(double monthSalary) {
		return monthSalary * 0.081;
	}
	
	public double calculateHealthInsurance(double monthSalary) {
		return monthSalary * 0.135;
	}
}
