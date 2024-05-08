package TS_003_LOGOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LG_003_LOGOUT_FUNCTIONALITY2 extends basetestamzn {
	@Test
	public void Logging_option_display_before_login() {
		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		//logout button is not displayed

	}
}