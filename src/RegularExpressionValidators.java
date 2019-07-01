import java.util.Scanner;

public class RegularExpressionValidators {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		getName(scnr);
		getEmail(scnr);
		getPhoneNumber(scnr);
		getDate(scnr);
		validateHtmlElements(scnr);
		
		System.out.println("Lab 7 is Finished!");

	}
	
	public static void getName(Scanner scnr) {
		boolean isValid;
		String input;
		
		do {
			System.out.println("Please enter a valid name: ");
			input = scnr.nextLine();
			
			if (input.matches("[A-Z]{1}[a-z]{0,29}")) {
				isValid = true;
			} else {
				isValid = false;
				System.out.println("Sorry, name is not valid!");
			}
			
		} while (!isValid);
		
		System.out.println("Thank you for your valid name entry.\n");
		
	}
	
	public static void getEmail(Scanner scnr) {
		boolean isValid;
		String input;
		
		do {
			System.out.println("Please enter a valid email: ");
			input = scnr.nextLine();
			
			if (input.matches("[A-Za-z0-9_]{5,30}@[A-Za-z0-9_]{5,10}.[A-Za-z0-9_]{2,3}")) {
				isValid = true;
			} else {
				isValid = false;
				System.out.println("Sorry, email is not valid!");
			}
			
		} while (!isValid);
		
		System.out.println("Thank you for your valid email entry.\n");
	}	
		
	public static void getPhoneNumber(Scanner scnr) {
		boolean isValid;
		String input;
		
		do {
			System.out.println("Please enter a phone number in the format XXX-XXX-XXX: ");
			input = scnr.nextLine();
			
			if (input.matches("\\d{3}-\\d{3}-\\d{4}")) {
				isValid = true;
			} else {
				isValid = false;
				System.out.println("Sorry, phone number is not valid!");
			}
			
		} while (!isValid);
		
		System.out.println("Thank you for your valid phone number entry.\n");
	}
	
	public static void getDate(Scanner scnr) {
		boolean isValid;
		String input;
		
		do {
			System.out.println("Please enter a date in the format dd/mm/yyyy: ");
			input = scnr.nextLine();
			
			if (input.matches("[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}")) {
				isValid = true;
			} else {
				isValid = false;
				System.out.println("Sorry, date is not valid!");
			}
			
		} while (!isValid);
		
		System.out.println("Thank you for your valid date entry.\n");
	}
	
	public static void validateHtmlElements(Scanner scnr) {
		boolean isValid;
		String input;
		
		do {
			System.out.println("Please enter an HTML element to validate: ");
			input = scnr.nextLine();
			if (input.matches("\\<(\\w*)\\>[\\s\\S]*\\<\\/\\1\\>")) { // the (text in the first tag name) is matched by the \1 in the second tag name spot. now the regex won't match unless the two tags match each other!
				isValid = true;
			} else {
				isValid = false;
				System.out.println("Sorry, HTML element is not valid.");
			}
		} while (!isValid);
		
		System.out.println("Thank you for your valid HTML element entry.\n");
	}
	
		
}
	
	//names regex: [A-Z]{1}[a-z]{0,29}
	
	//email regex: [A-Za-z0-9_]{5,30}@[A-Za-z0-9_]{5,10}.[A-Za-z0-9_]{2,3}
	
	//phone number regex: \d{3}-\d{3}-\d{4}
	
	// date regex: [0-9]{2}\/[0-9]{2}\/[0-9]{4}

	// AllTheThings! regex: \<(\w*)\>[\s\S]*\<\/\1\> 
	
	
	
	


