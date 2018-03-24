package alptiumpayroll;

public class HourlySalaries {

	private double hourlyRate;
	private int hoursWorked;

	public HourlySalaries(int idNum, double hourlyRate, int hoursWorked) {

		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;

	}

	public double gethourlyRate() {
		return hourlyRate;
	}

	public int gethoursWorked() {
		return hoursWorked;
	}

}
