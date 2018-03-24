package alptiumpayroll;

public class MonthlySalaries {

	private double grossPay;
	private double taxDeduction;
	private double netPay;

	public MonthlySalaries(int idNum, double grossPay, double taxDeduction, double netPay) {

		this.grossPay = grossPay;
		this.taxDeduction = taxDeduction;
		this.netPay = netPay;

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
