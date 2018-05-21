package alptiumpayroll;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// TODO: List is now in-memory but later we will put it into DB
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Aptium Payroll application");
			
			while(true) {
				System.out.println("If you want to add new employee, enter E");
				System.out.println("If employee is paid hourly, enter H");
				System.out.println("If employee is paid monthly, enter M");
				System.out.println("If you want to quit this program, enter Q");
				
				// TODO: Options for showing statistics (e.g. number of employees, 
				// total salary paid to all employees, separate employees & contractors
				// step: someone signs, and then HR office will click on a button "Pay salaries"
				// which will send data to a banking system
				
				String choice = sc.next();

				if (choice.equalsIgnoreCase("E")) {
					Employee employee = readEmployee();
					employees.add(employee);
				} else if (choice.equalsIgnoreCase("H")) {
					readHourlySalaries();
				} else if (choice.equalsIgnoreCase("M")) {
					readMonthlySalaries();
				} else if (choice.equalsIgnoreCase("Q")) {
					break;
				} else {
					System.out.println("Invalid input, please try again.");
				}				
			}
		}
	}

	
	// TODO: Read worker
	private static Employee readEmployee() {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter employee's ID number: ");
			int idNumber = sc.nextInt();

			System.out.println("Enter employee's first name: ");
			String firstName = sc.next();

			System.out.println("Enter employee's last name: ");
			String lastName = sc.next();

			System.out.println("Enter employee's parent name: ");
			String parentName = sc.next();

			System.out.println("Enter employee's date of birth: ");
			int dateOfBirth = sc.nextInt();

			System.out.println("Enter employee's jmbg: ");
			String jmbg = sc.next();
			
			while (!Validator.validateJmbg(jmbg)) {
				System.out.println("You entered wrong JMBG number!");
				System.out.println("Please try again.");
				jmbg = sc.next();
			}

			System.out.println("Enter employee's gender: ");
			String gender = sc.next();

			System.out.println("Enter employee's registration number: ");
			int regNumber = sc.nextInt();

			System.out.println("Enter employee's address: ");
			String address = sc.next();

			System.out.println("Enter employee's contact: ");
			int contact = sc.nextInt();

			System.out.println("Enter employee's social security number : ");
			int socialSecurityNumber = sc.nextInt();

			System.out.println("Enter employee's pay card number : ");
			int payCardNumber = sc.nextInt();

			Employee employee = new Employee(idNumber, firstName, lastName, parentName, dateOfBirth, jmbg, gender,
					regNumber, address, contact, socialSecurityNumber, payCardNumber);
			
			return employee;
		}
	}
	
	// TODO: When recording timesheets (for contractors) need to specify which contractor (what is their id?)

	// TODO: This relates to contractors
	
	private static void readHourlySalaries() {

		// TODO: Hourly rate is rarely changed, just like employee data
		// whilst hours worked is what varies month to month
		
		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				System.out.print("Enter Hourly Rate: ");
				double hourlyRate = sc.nextDouble();

				while (hourlyRate < 0) {
					System.out.print("Enter the hourly rate of pay for the employee: ");
					// TODO: Missing: Reading the new hourly rate
				}

				System.out.print("Enter the hours worked by employee this week: ");

				int hoursWorked = sc.nextInt();

				if (hoursWorked < 0) {
					System.out.println("Error: You have entered a negative number!");
					System.out.print("Enter the hours worked by employee this week: ");
				} else if (hoursWorked > 40) {// Overtime
					// TODO: Business logic
					
					// TODO: Check if this should be moved into region for >= && <= 40
					double hourlySalaries = hoursWorked * hourlyRate;
					double overTime = (hoursWorked - 40) * (hourlyRate * 1.5);
			    
//					System.out.println("Employee:" + FirstName);
					System.out.printf("Hourly Rate: $%.2f\n", hourlyRate);
					System.out.println("Regular Hours worked:" + hoursWorked);
					System.out.println("Overtime Hours worked:" + (hoursWorked - 40));
					System.out.printf("Overtime Pay: $%.2f\n", overTime);
					System.out.printf("Hourly salary: $%.2f\n", hourlySalaries);
				} else {
					System.out.print("dovla je u pravu");
				}
				
				System.out.printf("Enter next employee name or 'quit' to exit:");
			}

		}
	}
	
	// TODO: This is for regular full time employees

	private static void readMonthlySalaries() {
		try (Scanner sc = new Scanner(System.in)) {
			
			// TODO: Should take into account vacations, sick leave
			
			// Inputs: number of vacation days (70%), sick leave days (60%)

			// Rarely changes: gross salary (in contract) & tax deduction (as percent: health, pension)
			
			while (true) {
				System.out.println("Enter employee's gross pay : ");
				double grossPay = sc.nextDouble();

				System.out.println("Enter employee's tax deduction : ");
				int taxDeduction = sc.nextInt();

				System.out.println("Enter employee's net pay : ");
				int netPay = sc.nextInt();
			}
		}
	}
	
	
	// TODO: Enable user to quit the program, and to show the results of the calculations
	
	// TODO: Handling multiple employees
}