package com.capg;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.capg.UserRegistrtion;

public class CustomException {
	
	UserRegistrtion userRegistrtion = new UserRegistrtion();
	
	@Test
	public void givenFname_WhenProper_ShouldReturnTrue()
    {
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			Validator FirstName = (n) -> n.matches("^[A-Z]{1}[a-z]{2,}");// = userRegistrtion.firstName("Mehak");
			result = FirstName.validate("Mehak");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenFname_WhenProper_ShouldReturnFalse()
    {
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			Validator lastValidator = (n) -> n.matches("^[A-Z]{1}[a-z]{2,}");
			result = lastValidator.validate("mehak");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(result);
    }
	@Test
    public void givenLname_WhenProper_ShouldReturnTrue()
    {
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			Validator lastValidator = (n) -> n.matches("^[A-Z]{1}[a-z]{2,}");
			result = lastValidator.validate("Singh");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenLname_WhenProper_ShouldReturnFalse()
    {
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			Validator lastValidator = (n) -> n.matches("^[A-Z]{1}[a-z]{2,}");
			result = lastValidator.validate("mehak");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertFalse(result);
    }
	@Test
    public void givenEmail_WhenProper_ShouldReturnTrue()
    {
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			Validator validateEmail = (n) -> n.matches("^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}$");
			result = validateEmail.validate("abc@gmail.com");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenEmail_WhenProper_ShouldReturnFalse()
    {
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			Validator validateEmail = (n) -> n.matches("^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}$");
			result = validateEmail.validate("ab@gmail.com");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertFalse(result);
    }
	@Test
    public void givenPhNo_WhenProper_ShouldReturnTrue()
    {
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			Validator validatePhone = (n) -> n.matches("^[1-9]{1}[0-9]{1} [1-9]{1}[0-9]{9}");
			result = validatePhone.validate("91 9041924692");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenPhNo_WhenProper_ShouldReturnFalse()
    {
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			Validator validatePhone = (n) -> n.matches("^[1-9]{1}[0-9]{1} [1-9]{1}[0-9]{9}");
			result = validatePhone.validate("12345");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertFalse(result);
    }
	@Test
    public void givenPass_WhenProper_ShouldReturnTrue()
    {
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			Validator validatePhone = (n) -> n.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%]).{8,}");
			result = validatePhone.validate("Tes@121313");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertTrue(result);
    }
	@Test
    public void givenPass_WhenProper_ShouldReturnFalse()
    {
		boolean result = false;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(UserRegistrationException.class);
			Validator validatePhone = (n) -> n.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%]).{8,}");
			result = validatePhone.validate("test@lfhwkf");
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Assert.assertFalse(result);
    }
}
