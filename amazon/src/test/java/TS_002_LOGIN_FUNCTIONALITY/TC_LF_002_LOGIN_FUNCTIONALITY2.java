package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_002_LOGIN_FUNCTIONALITY2 extends basetestamzn {
	@Test
	public void logging_invalid_credentials_TC_LF_002() {
		driver.manage().window().maximize();
		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_no_l_f_002"))).sendKeys((loc.getProperty("user_mobile2")));
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();

	}
}
