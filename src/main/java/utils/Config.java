package main.java.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {

	public WebDriverWait wait;
	public Actions actions;
	public WebDriver driver;
	protected String baseURL = "YOUR_PAGE";

	@Before
	public void setUp() throws IOException, InterruptedException {

		// Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		this.driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public class WaitForPage {

		public void waitForLoad(WebDriver driver) {
			ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver driver) {
					return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
				}
			};
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(pageLoadCondition);
		}
	}

	@After
	public void close() {
		driver.quit();
	}
}
