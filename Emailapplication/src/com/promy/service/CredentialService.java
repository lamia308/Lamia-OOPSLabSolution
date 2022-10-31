package com.promy.service;

import java.util.Random;

import com.promy.model.Employee;

public class CredentialService {
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "012345689";
		String specialCharacters = "!@#$%^&*_=+-/.?<>";
		
		String values = capitalLetters + smallLetters + specialCharacters;
		Random random = new Random ();
		char [] password = new char [8];
		for (int i=0; i<8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		} 
		return password;
		
	}
	public String generateEmailAddress(String firstName, String lastName,String department) {
		return firstName+lastName+"@"+department+".abc.com";
	}
	public void showCredentials(Employee employee, String generatedEmail, char[] generatedPassword) {
		System.out.println("Dear"+" "+employee.getFirstName()+" "+"your generated credentials are as follows");
		System.out.println("Email--->"+generatedEmail);
		System.out.println("Password--->");
		for(int i=0; i<generatedPassword.length; i++) {
			System.out.print(generatedPassword[i]);
		}
	}

}
