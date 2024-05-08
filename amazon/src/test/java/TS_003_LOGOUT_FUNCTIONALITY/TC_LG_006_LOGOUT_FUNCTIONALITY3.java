package TS_003_LOGOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LG_006_LOGOUT_FUNCTIONALITY3 extends TC_LG_001_LOGOUT_FUNCTIONALITY {
	@Test
	public void ui() {

		TC_LG_006_LOGOUT_FUNCTIONALITY3 logout5 = new TC_LG_006_LOGOUT_FUNCTIONALITY3();
		logout5.Logging_out();

		// Proper and good UI are displayed on the 'Register Account' page

	}
}