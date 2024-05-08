package TS_003_LOGOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LG_001_LOGOUT_FUNCTIONALITY extends basetestamzn {
	@Test
	public void Logging_out() {
		driver.manage().window().maximize();
		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_no_f1_00001"))).sendKeys((loc.getProperty("user_mobilelf1_00001")));
		driver.findElement(By.xpath(loc.getProperty("continuelf1"))).click();
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys((loc.getProperty("user_passwordlf1")));
		driver.findElement(By.xpath(loc.getProperty("keep_login1lf1"))).click();
		driver.findElement(By.xpath(loc.getProperty("click_signinlf1"))).click();
		// mouse hover
		WebElement sign_in_account_button1 = driver.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover1lf1")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button1).perform();
		driver.findElement(By.xpath(loc.getProperty("click_on_logoutlf1"))).click();
	}
}