package com.bridgelabz.userregistrationproblem;

import org.junit.Test;

import org.junit.Assert;

public class userRegistrationTest {
	boolean result;

	userRegistration userregistration = new userRegistration();

	@Test
	public void isValidFirstName() {
		userRegistration userregistration = new userRegistration();
		boolean result = userregistration.isvalidfirstName("Kiran");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidLastName() {
		userRegistration userregistration = new userRegistration();
		boolean result = userregistration.isvalidlastName("Urshil");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidEmail() {
		userRegistration userregistration = new userRegistration();
		boolean result = userregistration.isvalidEmail("kiranurshil999@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidMobileNumber() {
		userRegistration userregistration = new userRegistration();
		boolean result = userregistration.isvalidMobileNumber("91 9168068152");
		Assert.assertEquals(true, result);
	}

	@Test
	public void isValidPassword() {
		userRegistration userregistration = new userRegistration();
		boolean result = userregistration.isvalidPassword("kiranravi");
		Assert.assertEquals(true, result);
	}

}
