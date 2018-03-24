package alptiumpayroll;

public class Employee {

	private int idNumb;
	private String firstName;
	private String lastName;
	private String parentName;
	private int dateOfBirth;
	private int jmbg;
	private boolean gender;
	private int regNumb;
	private String address;
	private int contact;
	private int ssNumb;
	private int payCardNumb;

	public Employee(int idNumb, String firstName, String lastName, String parentName, int dateOfBirth, int jmbg,
			boolean gender, int regNumb, String address, int contact, int ssNumb, int payCardNumb) {

		this.idNumb = idNumb;
		this.firstName = firstName;
		this.lastName = lastName;
		this.parentName = parentName;
		this.dateOfBirth = dateOfBirth;
		this.jmbg = jmbg;
		this.gender = gender;
		this.regNumb = regNumb;
		this.address = address;
		this.contact = contact;
		this.ssNumb = ssNumb;
		this.payCardNumb = payCardNumb;
	}

	public int getidNumb() {
		return idNumb;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getparentName() {
		return parentName;
	}

	public int getdateOfBirth() {
		return dateOfBirth;
	}

	public int getjmbg() {
		return jmbg;
	}

	public boolean getgender() {
		return gender;
	}

	public int getregNumb() {
		return regNumb;
	}

	public String getaddress() {
		return address;
	}

	public int getcontact() {
		return contact;
	}

	public int getssNumb() {
		return ssNumb;
	}

	public int getpayCardNumb() {
		return payCardNumb;
	}
}