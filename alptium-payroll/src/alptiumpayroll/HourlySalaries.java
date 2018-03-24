package alptiumpayroll;

public class HourlySalaries {

	private double hourlyRate;
	private int hoursWorked;
	private double grossPay;
	private double taxDeduction;
	private double netPay;

	public HourlySalaries(double hourlyRate, int hoursWorked, double grossPay, double taxDeduction, double netPay) {

		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.grossPay = grossPay;
		this.taxDeduction = taxDeduction;
		this.netPay = netPay;
	
	}

	public double gethourlyRate() {
		return hourlyRate;
	}

	public int gethoursWorked() {
		return hoursWorked;
	}

	public double getgrossPay() {
		return grossPay;
	}

	public double gettaxDeduction() {
		return taxDeduction;
	}

	public double getnetPay() {
		return netPay;
	}

}
