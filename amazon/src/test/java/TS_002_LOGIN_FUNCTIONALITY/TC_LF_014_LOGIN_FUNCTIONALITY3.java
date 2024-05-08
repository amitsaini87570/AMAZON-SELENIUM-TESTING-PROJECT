package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_014_LOGIN_FUNCTIONALITY3 extends basetestamzn {
	@Test
	public void logging_ui_TC_LF_014() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		//  Proper and good UI are displayed on the 'Register Account' page

	}
}
