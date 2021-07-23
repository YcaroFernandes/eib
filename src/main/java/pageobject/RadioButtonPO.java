package main.java.pageobject;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.utils.Config;

public class RadioButtonPO extends Config {

	@FindBy(xpath = "//input[contains(@id,'metrobarView:operationIQDatatable:')]")

	private WebElement generalRadioButton;

	public RadioButtonPO(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 15, 50);
		actions = new Actions(driver);

	}

	public void selectRandomRadioButton() {
		wait.until(ExpectedConditions.visibilityOf(generalRadioButton));
		List<WebElement> options = driver
				.findElements(By.xpath("//input[contains(@id,'metrobarView:operationIQDatatable:')]"));
		Random random = new Random();
		int index = random.nextInt(options.size());
		options.get(index).click();

	}

}
