package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_005_LOGIN_FUNCTIONALITY3 extends basetestamzn {
	@Test
	public void forgot_password_TC_LF_005() {

		driver.manage().window().maximize();
		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		// click on need help
		driver.findElement(By.xpath(loc.getProperty("click_on_need_help"))).click();
		// click on forgot password
		driver.findElement(By.xpath(loc.getProperty("click_on_Forgot_Password"))).click();

	}
}
