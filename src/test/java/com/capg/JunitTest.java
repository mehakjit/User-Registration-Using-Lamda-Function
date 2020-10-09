package com.capg;

import org.junit.*;

public class JunitTest {
	
	@Test
	public void firstName_Is_True_Return_Type_Happy(){
		UserRegistrtion obj =new UserRegistrtion();
		String result = obj.firstName("Mehakjit");
		Assert.assertEquals("Valid", result);
	}
	
	@Test
	public void firstName_Is_False_Return_Type_Sad(){
		UserRegistrtion obj =new UserRegistrtion();
		String result = obj.firstName("mehakjit");
		Assert.assertEquals("Invalid", result);
	}
	
	@Test
	public void lastName_Is_True_Return_Type_Happy(){
		UserRegistrtion obj =new UserRegistrtion();
		String result = obj.lastName("Singh");
		Assert.assertEquals("Valid", result);
	}
	
	@Test
	public void lastName_Is_False_Return_Type_Sad(){
		UserRegistrtion obj =new UserRegistrtion();
		String result = obj.lastName("singh");
		Assert.assertEquals("Invalid", result);
	}
	@Test
	public void emailId_Is_True_Return_Type_Happy(){
		UserRegistrtion obj =new UserRegistrtion();
		String result = obj.emailID("abc@gmail.com");
		Assert.assertEquals("Valid", result);
	}
	
	@Test
	public void emailId_Is_False_Return_Type_Sad(){
		UserRegistrtion obj =new UserRegistrtion();
		String result = obj.emailID("mehak@gmail.love.india");
		Assert.assertEquals("Invalid", result);
	}
	@Test
	public void mobileNo_Is_True_Return_Type_Happy(){
		UserRegistrtion obj =new UserRegistrtion();
		String result = obj.mobileNo("91 9041924692");
		Assert.assertEquals("Valid", result);
	}
	
	@Test
	public void mobileNo_Is_False_Return_Type_Sad(){
		UserRegistrtion obj =new UserRegistrtion();
		String result = obj.mobileNo("9041924692");
		Assert.assertEquals("Invalid", result);
	}
	
	@Test
	public void password_Is_True_Return_Type_Happy(){
		UserRegistrtion obj =new UserRegistrtion();
		String result = obj.password("Mehak@123");
		Assert.assertEquals("Valid", result);
	}
	
	@Test
	public void password_Is_False_Return_Type_Sad(){
		UserRegistrtion obj =new UserRegistrtion();
		String result = obj.password("mehak");
		Assert.assertEquals("Invalid", result);
	}
}
