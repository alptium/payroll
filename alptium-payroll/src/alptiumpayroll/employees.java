package alptiumpayroll;

public class employees {

	private int registrationNumber;
	private String firstName;
	private String lastName;
	private String parentName;
	private int dateOfBirth;
	private int jmbg;
	private int idNumber;
	private String address;
	private int contact;

	public employees(int registrationNumber, String firstName, String lastName, String parentName, int dateOfBirth,
			int jmbg, int idNumber, String address, int contact) {

		this.registrationNumber = registrationNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.parentName = parentName;
		this.dateOfBirth = dateOfBirth;
		this.jmbg = jmbg;
		this.idNumber = idNumber;
		this.address = address;
		this.contact = contact;

	}

	public int getregistrationNumber() {
		return registrationNumber;
	}

	public void setregistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String parentName() {
		return parentName;
	}

	public void setparentName(String parentName) {
		this.parentName = parentName;
	}

	public int getdateOfBirth() {
		return dateOfBirth;
	}

	public void setdateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getjmbg() {
		return jmbg;
	}

	public void jmbg(int jmbg) {
		this.jmbg = jmbg;
	}

	public int getidNumber() {
		return idNumber;
	}

	public void idNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public int getcontact() {
		return contact;
	}

	public void setcontact(int contact) {
		this.contact = contact;
	}
}