package com.bridgelabz.userregistrationproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class userRegistrationTest {
	 
	 private String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	    private Pattern pattern = Pattern.compile(regex);
	
	    @Test
	    public void testValidEmails() {
	        String[] validEmails = {
	                "abc@yahoo.com",
	                "abc-100@yahoo.com",
	                "abc.100@yahoo.com",
	                "abc111@abc.com",
	                "abc-100@abc.net",
	                "abc.100@abc.com.au",
	                "abc@1.com",
	                "abc@gmail.com.com",
	                "abc+100@gmail.com"
	        };

	        for (String email : validEmails) {
	            Matcher matcher = pattern.matcher(email);
	            boolean result = matcher.matches();
	            Assert.assertEquals(email + " should be a valid email", true, result);
	        }
	    }

	 
	   
	}
	    
