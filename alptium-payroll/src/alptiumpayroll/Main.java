package alptiumpayroll;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Aptium Payroll application");
	System.out.println("If you want to add new employee, enter E");
	System.out.println("If employee is paid hourly, enter H");
	System.out.println("If employee is paid monthly, enter M");
	
	String choise = sc.next();
	  
	if(choise.equals("E") || choise.equals("e")) {
		 runDemoEmployee(); 
	} else if(choise.equals("H") || choise.equals("h")) {
		 runDemoHourlySalaries();
	} else if(choise.equals("M") || choise.equals("m")) {
		 runDemoMonthlySalaries();		
	} else while (!choise.equals("E") && !choise.equals("e") && !choise.equals("H") && !choise.equals("h") && !choise.equals("M") && !choise.equals("m")) {
		System.out.println("Information are entered incorrectly!");
				 System.out.println("Please, try again");
		 System.out.println();
		 choise = sc.next();
	 }
		} 
}		
		


	private static void runDemoEmployee() {

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

			Employee employees = new Employee(idNumb, firstName, lastName, parentName, dateOfBirth, jmbg, gender,
					regNumb, address, contact, ssNumb, payCardNumb);
		}
	}

	private static void runDemoHourlySalaries() {

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {
				System.out.println("Enter employee's hourly rate : ");
				double hourlyRate = sc.nextDouble();

				System.out.println("Enter employee's hours worked : ");
				int hoursWorked = sc.nextInt();
			}
		}
	}

	private static void runDemoMonthlySalaries() {
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
}