package alptiumpayroll;

public class Employee extends Worker {

	private int ssNumb;
	
	public Employee(int idNumb, String firstName, String lastName, String parentName, int dateOfBirth, String jmbg,
			String gender, int regNumb, String address, int contact, int payCardNumb, int ssNumb) {
		super(idNumb, firstName, lastName, parentName, dateOfBirth, jmbg, gender, regNumb, address, contact, payCardNumb);
		this.ssNumb = ssNumb;
	}
	
	public int getssNumb() {
		return ssNumb;
	}
}