package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_003_LOGIN_FUNCTIONALITY3 extends basetestamzn {
	@Test
	public void logging_invalid_password_TC_LF_003() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		driver.findElement(By.xpath(loc.getProperty("user_mobilel_f_003")))
				.sendKeys((loc.getProperty("user_mobilE03")));
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys((loc.getProperty("user_password3")));
		driver.findElement(By.xpath(loc.getProperty("keep_login1"))).click();
		driver.findElement(By.xpath(loc.getProperty("click_signin"))).click();

	}
}
