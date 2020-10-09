package com.capg;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class ParameterisedTest {
	private String sample;
	private String validity;
	
	public ParameterisedTest(String emailSample, String expectedResult) {
	this.sample = emailSample;
	this.validity = expectedResult;
	}
	@Parameterized.Parameters
	public static Collection data() {
	return Arrays.asList(new Object[][] {{"abc@yahoo.com", "Valid"},
	                                     {"abc-100@yahoo.com", "Valid"},
	                                     {"abc.100@yahoo.com", "Valid"},
	                                     {"abc111@abc.com", "Invalid"},
	                                     {"abc-100@abc.net", "Valid"},
	                                     {"abc.100@abc.com.au", "Valid"},
	                                     {"abc@1.com", "Invalid"},
	                                     {"abc@gmail.com.com", "Invalid"},
	                                     {"abc+100@gmail.com", "Valid"},
	                                     {"abc", "Invalid"},
	                                     {"abc@.com.my", "Invalid"},
	                                     {"abc123@gmail.a", "Invalid"},
	                                     {"abc123@.com", "Invalid"},
	                                     {"abc123@.com.com", "Invalid"},
	                                     {".abc@abc.com", "Invalid"},
	                                     {"abc()*@gmail.com", "Invalid"},
	                                     {"abc@%*.com", "Invalid"},
	                                     {"abc..2002@gmail.com", "Invalid"},
	                                     {"abc.@gmail.com", "Invalid"},
	                                     {"abc@abc@gmail.com", "Invalid"},
	                                     {"abc@gmail.com.1a", "Invalid"},
	                                     {"abc@gmail.com.aa.au", "Invalid"}
	                                     });
				
	}
	@Test
	public void testEmail() {
	UserRegistrtion user = new UserRegistrtion();
	String result = user.emailID(this.sample);
	Assert.assertEquals(this.validity, result);
	}
}
