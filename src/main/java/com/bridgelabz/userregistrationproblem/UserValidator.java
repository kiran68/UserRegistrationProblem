package com.bridgelabz.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class UserValidator {

	    private String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	    private Pattern pattern = Pattern.compile(regex);

	    public void validateFirstName(String firstName) throws InvalidFirstNameException {
	        if (firstName.isEmpty()) {
	            throw new InvalidFirstNameException("Invalid first name");
	        }
	    }

	    public void validateLastName(String lastName) throws InvalidLastNameException {
	        if (lastName.isEmpty()) {
	            throw new InvalidLastNameException("Invalid last name");
	        }
	    }

	    public void validateEmail(String email) throws InvalidEmailException {
	        Matcher matcher = pattern.matcher(email);
	        if (!matcher.matches()) {
	            throw new InvalidEmailException("Invalid email");
	        }
	    }

	    public void validateMobile(String mobile) throws InvalidMobileException {
	        if (mobile.length() != 10) {
	            throw new InvalidMobileException("Invalid mobile");
	        }
	    }

	    public void validatePassword(String password) throws InvalidPasswordException {
	        if (password.length() < 8) {
	            throw new InvalidPasswordException("Invalid password");
	        }
	    }
	}

	
	class InvalidFirstNameException extends Exception {
	    public InvalidFirstNameException(String message) {
	        super(message);
	    }
	}

	class InvalidLastNameException extends Exception {
	    public InvalidLastNameException(String message) {
	        super(message);
	    }
	}

	class InvalidEmailException extends Exception {
	    public InvalidEmailException(String message) {
	        super(message);
	    }
	}

	class InvalidMobileException extends Exception {
	    public InvalidMobileException(String message) {
	        super(message);
	    }
	}

	class InvalidPasswordException extends Exception {
	    public InvalidPasswordException(String message) {
	        super(message);
	    }
	}