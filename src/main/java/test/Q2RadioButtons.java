package main.java.test;

import org.junit.Before;
import org.junit.Test;

import main.java.pageobject.RadioButtonPO;
import main.java.utils.Config;

public class Q2RadioButtons extends Config {

	RadioButtonPO radiobuttonpageobject;

	@Before
	public void setup() {
		radiobuttonpageobject = new RadioButtonPO(driver);

	}

	@Test
	public void selectRandomRadioButton() throws Exception {

		radiobuttonpageobject.selectRandomRadioButton();

	}

}
