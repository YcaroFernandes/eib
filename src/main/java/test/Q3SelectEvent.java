package main.java.test;

import org.junit.Before;
import org.junit.Test;

import main.java.pageobject.EventPO;
import main.java.utils.Config;

public class Q3SelectEvent extends Config {

	EventPO eventpageobject;

	@Before
	public void setup() {
		eventpageobject = new EventPO(driver);

	}

	@Test
	public void selectRandomRadioButton() throws Exception {

		eventpageobject.selectEvent();

	}

}
