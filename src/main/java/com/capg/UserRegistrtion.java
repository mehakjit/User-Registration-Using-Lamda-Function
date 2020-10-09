package com.capg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrtion {
	
	public static String firstName(String firstName) {
		//for(int i = 0;i<1;) {
			Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
			Matcher matcher = pattern.matcher(firstName);
			boolean matchfound = matcher.find();
			if(matchfound) {
				return "Valid";
	//			i=1;
				}
			else {
				return "Invalid";
		//	}		
		}
	}
		
	public static String lastName(String lastName) {
	//	for(int i = 0;i<1;) {
			Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
			Matcher matcher = pattern.matcher(lastName);
			boolean matchfound = matcher.find();
			if(matchfound) {
				return "Valid";
	//			i=1;
				}
			else {
				return "Invalid";
		//	}		
		}
	}
		
	public static String emailID(String emailID) {
	//	for(int i = 0;i<1;) {
			Pattern pattern =Pattern.compile("^[a-z]{3,}([-+-.]{1}[a-zA-Z0-9]{3})?@[a-z]{2,}\\.[a-z]{2,4}(\\.[a-z]{2})?$");
			Matcher matcher = pattern.matcher(emailID);
			boolean matchfound = matcher.find();
			if(matchfound) {
				return "Valid";
	//			i=1;
				}
			else {
				return "Invalid";
		//	}		
		}
	}
	
	public static String mobileNo(String mobileNo) {
	//	for(int i = 0;i<1;) {
			Pattern pattern =Pattern.compile("^[0-9]{2}\\s[1-9]{1}[0-9]{9}$");
			Matcher matcher = pattern.matcher(mobileNo);
			boolean matchfound = matcher.find();
			if(matchfound) {
				return "Valid";
	//			i=1;
				}
			else {
				return "Invalid";
		//	}		
		}
	}
	
	public static String password(String password) {
	//	for(int i = 0;i<1;) {
			Pattern pattern =Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%]).{8,}");
			Matcher matcher = pattern.matcher(password);
			boolean matchfound = matcher.find();
			if(matchfound) {
				return "Valid";
	//			i=1;
				}
			else {
				return "Invalid";
		//	}		
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Wizard");
		Scanner sc =  new Scanner(System.in);
				System.out.println("Enter First name ");
				firstName(sc.nextLine());
				System.out.println("Enter Last name ");
				lastName(sc.nextLine());
				System.out.println("Enter E-mail Id ");
				emailID(sc.nextLine());
				System.out.println("Enter Mobile No ");
				mobileNo(sc.nextLine());
				System.out.println("Enter password ");
				password(sc.nextLine());
			sc.close();
		}
	}
	