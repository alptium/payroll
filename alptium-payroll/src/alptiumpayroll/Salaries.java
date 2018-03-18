package alptiumpayroll;

public class Salaries {

	private double hourlyRate;
	private int hoursWorked;
	private double grossPay;
	private double taxDeduction;
	private double netPay;
	private int overtime;

	public Salaries(double hourlyRate, int hoursWorked, double grossPay, double taxDeduction, double netPay,
			int overtime) {

		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.grossPay = grossPay;
		this.taxDeduction = taxDeduction;
		this.netPay = netPay;
		this.overtime = overtime;

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

	public int getovertime() {
		return overtime;
	}
}
