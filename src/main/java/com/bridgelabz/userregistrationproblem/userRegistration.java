package com.bridgelabz.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {

	public static void main(String[] args) {
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email Address: ");
		String data = sc.nextLine();

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(data);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Valid Email");
		} else {
			System.out.println("Invalid Email");
		}

	}
}
