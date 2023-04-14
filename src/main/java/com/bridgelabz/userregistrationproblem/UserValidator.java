package com.bridgelabz.userregistrationproblem;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String firstName = getUserInput(scanner, "Enter first name: ", s -> s.matches("[A-Za-z]+"),
				"Invalid first name!");

		String lastName = getUserInput(scanner, "Enter last name: ", s -> s.matches("[A-Za-z]+"), "Invalid last name!");

		String email = getUserInput(scanner, "Enter email: ",
				s -> s.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}"), "Invalid email!");

		String mobile = getUserInput(scanner, "Enter mobile number: ", s -> s.matches("\\d{10}"),
				"Invalid mobile number!");

		String password = getUserInput(scanner, "Enter password: ",
				s -> s.matches( "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$"), "Invalid password!");

		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Email: " + email);
		System.out.println("Mobile number: " + mobile);
		System.out.println("Password: " + password);
	}

	private static String getUserInput(Scanner scanner, String prompt, Predicate<String> validator, String errorMsg) {
		String input;
		boolean valid;
		do {
			System.out.print(prompt);
			input = scanner.nextLine();
			valid = validator.test(input);
			if (!valid) {
				System.out.println(errorMsg);
			}
		} while (!valid);
		return input;
	}
}