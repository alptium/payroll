package alptiumpayroll;

public class MonthlySalaries {

	private double grossPay;
	private double taxDeduction;
	private double netPay;

	public MonthlySalaries(int idNumb, double grossPay, double taxDeduction, double netPay) {
		this.grossPay = grossPay;
		this.taxDeduction = taxDeduction;
		this.netPay = netPay;
	}
	
	public double getGrossPay() {
		return grossPay;
	}

	public double getTaxDeduction() {
		return taxDeduction;
	}

	public double getNetPay() {
		return netPay;
	}
}
