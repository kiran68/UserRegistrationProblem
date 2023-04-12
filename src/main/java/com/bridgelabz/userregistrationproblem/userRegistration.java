package com.bridgelabz.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {

	public static void main(String[] args) {
		String regex ="^91\\s\\d{10}$";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile Number: ");
		String mobileNO = sc.nextLine();

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNO);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Valid Mobile Number");
		} else {
			System.out.println("Invalid Mobile Number");
		}

	}
}
