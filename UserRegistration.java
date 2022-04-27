package com.bl.day23;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name to be checked valid or not");
		String firstName = scanner.next();
		
		boolean isValidFirstName = UserRegistration.validateName().validateDetails(firstName);
		System.out.println((isValidFirstName == false) ? "Entered name is not valid": "");
		
		System.out.println("Enter the last name to be checked true or false");
		String lastName = scanner.next();
		
		boolean isvalidLastName = UserRegistration.validateName().validateDetails(lastName);
		System.out.println((isvalidLastName == false) ? "Entered name is not valid": "");
		
		System.out.println("Enter the email to be checked if true or false");
		String emailID = scanner.next();
		
		boolean isValidEmail = UserRegistration.validateEmail().validateDetails(emailID);
		System.out.println((isValidEmail == false) ? "Entered email id is not valid": "");
		
		System.out.println("Enter the mobile no to checked"); 
		String mobno = scanner.next();
		
		boolean isValidMobNo = UserRegistration.validateMobile().validateDetails(mobno);
		System.out.println((isValidMobNo == false) ? "Entered mobile number is not valid": "");

		System.out.println("Enter the password to be checked"); 
		String password = scanner.next();
		
		boolean isValidPassword = UserRegistration.validateMobile().validateDetails(password);
		System.out.println((isValidPassword == false) ? "Entered password is not valid": "");
		
	}
	
	@FunctionalInterface
	interface Validate {
		
		public boolean validateDetails(String details);		
	}
	
	public static Validate validateName() {
		 return data -> data.matches("^[A-Z].*{3,}");
	}
	
	public static Validate validateEmail() {
		return data -> data.matches(("^(.+)@bl.co(.+)$"));
	}
	
	public static Validate validateMobile() {
		return data -> data.matches("91[0-9]{10}");	
	}
	
	public static Validate validatePassword() {
		return data -> data.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}");
	}
	
}
