package com.bridgelabz.userregistrationproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {

	public static boolean isvalidfirstName(String firstName) {
		String regex = "^[A-Z][A-Za-z]{3,}";
		Pattern pattern = Pattern.compile(regex);
		if (firstName == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public static boolean isvalidlastName(String lastName) {
		String regex = "^[A-Z][A-Za-z]{3,}";
		Pattern pattern = Pattern.compile(regex);
		if (lastName == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	public static boolean isvalidEmail(String Email) {
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		if (Email == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(Email);
		return matcher.matches();

	}

	public static boolean isvalidMobileNumber(String mobileNumber) {
		String regex = "^91 \\d{10}$";
		Pattern pattern = Pattern.compile(regex);
		if (mobileNumber == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();

	}

	public static boolean isvalidPassword(String password) {
		String regex = "^.{8,}$";
		Pattern pattern = Pattern.compile(regex);
		if (password == null) {
			return false;
		}
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}
}