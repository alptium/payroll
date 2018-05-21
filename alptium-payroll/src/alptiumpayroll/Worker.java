package alptiumpayroll;

public class Worker {

	private int idNumb;
	private String firstName;
	private String lastName;
	private String parentName;
	private int dateOfBirth;
	private String jmbg; // TODO: Check type
	private String gender;
	private int regNumb;
	private String address;
	private int contact;
	private int payCardNumb;


	public Worker(int idNumb, String firstName, String lastName, String parentName, int dateOfBirth, String jmbg,
			String gender, int regNumb, String address, int contact, int payCardNumb) {

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

	public String getjmbg() {
		return jmbg;
	}

	public String getgender() {
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
	
	public int getpayCardNumb() {
		return payCardNumb;
	}
	

}
