package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_001_LOGIN_FUNCTIONALITY extends basetestamzn {
	@Test
	public void logging_valid_credentials_TC_LF_001() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_no_l_f_001")))
				.sendKeys((loc.getProperty("user_mobilel_f_001")));
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys((loc.getProperty("user_password1")));
		driver.findElement(By.xpath(loc.getProperty("keep_login1"))).click();
		driver.findElement(By.xpath(loc.getProperty("click_signin"))).click();

	}
}
