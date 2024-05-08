package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_007_LOGIN_FUNCTIONALITY2 extends basetestamzn {
	@Test
	public void back_after_login_TC_LF_007() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_no7"))).sendKeys((loc.getProperty("user_mobile7")));
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();
		driver.findElement(By.xpath(loc.getProperty("password7"))).sendKeys((loc.getProperty("user_password7")));
		driver.findElement(By.xpath(loc.getProperty("keep_login1"))).click();
		driver.findElement(By.xpath(loc.getProperty("click_signin"))).click();
		driver.navigate().back();
		// user is logged out
		Assert.assertTrue(false);
	}
}
