package alptiumpayroll;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Aptium Payroll application");
		System.out.println("Page employee");

		runDemoEmployees();
	}

	private static void runDemoEmployees() {

		System.out.println("Add new employee");
		System.out.println();

		try (Scanner sc = new Scanner(System.in)) {

			while (true) {

				System.out.println("Enter employee's registration number");
				String registrationNumber = sc.next();

				System.out.println("Enter employee's first name");
				String firstName = sc.next();

				System.out.println("Enter employee's last name");
				String lastName = sc.next();

				System.out.println("Enter employee's parent name");
				String parentName = sc.next();

				System.out.println("Enter employee's date of birth");
				String dateOfBirth = sc.next();

				System.out.println("Enter employee's jmbg");
				String jmbg = sc.next();

				System.out.println("Enter employee's ID number");
				String idNumber = sc.next();

				System.out.println("Enter employee's address");
				String address = sc.next();

				System.out.println("Enter employee's contact");
				String contact = sc.next();

				Employee employees = new Employee(Integer.parseInt(registrationNumber), firstName, lastName,
						parentName, Integer.parseInt(dateOfBirth), Integer.parseInt(jmbg), Integer.parseInt(idNumber),
						address, Integer.parseInt(contact));
				System.out.println("Your input is completed. Do you want to enter a new employee? Y/N");

				String answer = sc.next();

				if (answer.equals("N"))
					break;
			}
		}
	}

}