package alptiumpayroll;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Aptium Payroll application");
			System.out.println("If you want to add new employee, enter E");
			System.out.println("If employee is paid hourly, enter H");
			System.out.println("If employee is paid monthly, enter M");

			String choice = sc.next();

			if (choice.equalsIgnoreCase("E")) {
				readEmployee();
			} else if (choice.equalsIgnoreCase("H")) {
				readHourlySalaries();
			} else if (choice.equalsIgnoreCase("M")) {
				readMonthlySalaries();
			} else {
				while (!choice.equalsIgnoreCase("E") 
						&& !choice.equalsIgnoreCase("H")
						&& !choice.equalsIgnoreCase("M")) {
					System.out.println("Invalid input, please select: E | H | M.");
					System.out.println("Please, try again");
					System.out.println();
					choice = sc.next();
				}
			}
		}
	}

	private static void readEmployee() {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter employee's ID number: ");
			int idNumb = sc.nextInt();

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
			int jmbgLength = jmbg.length();

			// TODO: Move to business
			
			if (jmbgLength != 13) {
				System.out.println("You entered wrong JMBG number!");
				System.out.println("Please try again.");
				String jmbg1 = sc.next();
				jmbg = jmbg1;
			}

			System.out.println("Enter employee's gender: ");
			String gender = sc.next();

			System.out.println("Enter employee's registration number: ");
			int regNumb = sc.nextInt();

			System.out.println("Enter employee's address: ");
			String address = sc.next();

			System.out.println("Enter employee's contact: ");
			int contact = sc.nextInt();

			System.out.println("Enter employee's social security number : ");
			int ssNumb = sc.nextInt();

			System.out.println("Enter employee's pay card number : ");
			int payCardNumb = sc.nextInt();

			Employee employee = new Employee(idNumb, firstName, lastName, parentName, dateOfBirth, jmbg, gender,
					regNumb, address, contact, ssNumb, payCardNumb);
		}
	}

	// TODO: This relates to contractors
	
	private static void readHourlySalaries() {

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