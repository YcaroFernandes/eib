package main.java.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.utils.Config;

public class EventPO extends Config {

	@FindBy(xpath = "//span[(@data-item-value = 'GENERIC_EVENT_01_APPROVAL_BY_ADVISORT_COMMITTEE')]")

	private WebElement select5thEvent;

	public EventPO(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15, 50);
		actions = new Actions(driver);

	}

	public void selectEvent() {

		wait.until(ExpectedConditions.elementToBeClickable(select5thEvent));
		select5thEvent.click();
	}

}
