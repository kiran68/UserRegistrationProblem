package com.bridgelabz.userregistrationproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {

public static void main(String[] args) {
		
		System.out.println("Enter The Last Name : ");
		Scanner sc = new Scanner(System.in);
		String lastName = sc.nextLine();
		
	
		String regex = ("^[A-Z][a-zA-Z]{2,}$");
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher( lastName);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Pattern Is Match Last Name Name");
			System.out.println( "Last Name :"    + lastName);
		} else {
			System.out.println("Pattern not matches");
		}

	}
}
