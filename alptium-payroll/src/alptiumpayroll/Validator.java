package alptiumpayroll;

public class Validator {
	
	public static boolean validateJmbg(String jmbg) {
		int jmbgLength = jmbg.length();
		boolean valid = jmbgLength == 13;
		
		// TODO: Later simulate connection to external system which has list of JMBG numbers
		// and to validate does the JMBG truly exist?
		
		return valid;
	}
}
