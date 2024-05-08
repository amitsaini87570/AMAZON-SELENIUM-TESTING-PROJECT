package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_004_LOGIN_FUNCTIONALITY2 extends basetestamzn {
	@Test
	public void Without_credentials_TC_LF_004() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();

	}
}
