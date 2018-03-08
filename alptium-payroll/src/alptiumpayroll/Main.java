package alptiumpayroll;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			
		try(Scanner sc = new Scanner(System.in)) {
		
		System.out.println("Aptium Payroll application");
		System.out.println("Please, insert a new employee");
		}
	}				
		private static void runDemoEmployees() {
			
			System.out.println("Page EMPLOYEE");
			System.out.println();
			
			try(Scanner sc = new Scanner(System.in)){
				
				System.out.println("Enter employee's registration number");
				String registrationNumber = sc.next();
				
				System.out.println("Enter employee's first name");
				String firstName = sc.next();
				
				System.out.println("Enter employee's last name");
				String lastName = sc.next();
				
				System.out.println("Enter employee's parent name");
				String parentName = sc.next();
				
				System.out.println("Enter employee's birth year");
				String dateOfBirth = sc.next();
				
				System.out.println("Enter employee's jmbg");
				String jmbg = sc.next();
				
				System.out.println("Enter employee's ID number");
				String idNumber = sc.next();
				
				System.out.println("Enter employee's address");
				String address = sc.next();
				
				System.out.println("Enter employee's contact");
				String contact = sc.next();
				
				
			}
		}
		
		}