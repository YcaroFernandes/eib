package main.java.test;

import org.junit.Before;
import org.junit.Test;

import main.java.pageobject.LoginPO;
import main.java.utils.Config;

public class Q1Login extends Config {

	LoginPO loginpageobject;

	@Before
	public void setup() {
		loginpageobject = new LoginPO(driver);

	}

	@Test
	public void validateSuccessMessage() throws Exception {

		loginpageobject.usernameField();
		loginpageobject.passwordField();
		loginpageobject.loginButton();
		loginpageobject.validateMessage("success");

	}
	
	@Test
	public void validateInvalidEmailMessage() throws Exception {

		loginpageobject.usernameField();
		loginpageobject.passwordField();
		loginpageobject.loginButton();
		loginpageobject.validateMessage("invalid email");

	}
	
	@Test
	public void validateEnterCorrectEmailMessage() throws Exception {

		loginpageobject.usernameField();
		loginpageobject.passwordField();
		loginpageobject.loginButton();
		loginpageobject.validateMessage("enter correct");

	}
	
	@Test
	public void validateCorrectPageMessage() throws Exception {

		loginpageobject.usernameField();
		loginpageobject.passwordField();
		loginpageobject.loginButton();
		loginpageobject.validateMessage("Correct Page");

	}
}
