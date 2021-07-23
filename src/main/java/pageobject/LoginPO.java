package main.java.pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.utils.Config;

public class LoginPO extends Config {

	@FindBy(id = "username")

	private WebElement usernameField;

	@FindBy(id = "password")

	private WebElement passwordField;

	@FindBy(id = "kc-login")

	public WebElement loginButton;
	
	public LoginPO(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15, 50);
		actions = new Actions(driver);
		
	}
	

	public void usernameField() {
		wait.until(ExpectedConditions.visibilityOf(usernameField));
		usernameField.sendKeys("xxx");
	}

	public void passwordField() {
		wait.until(ExpectedConditions.visibilityOf(passwordField));
		passwordField.sendKeys("yyy");
	}

	public void loginButton() {

		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
	}

	public void validateMessage(String message) {
		
		boolean isTheTextPresent = driver.getPageSource().contains(message);
		assertTrue(isTheTextPresent);

		
	}

}
