package TS_003_LOGOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LG_004_LOGOUT_FUNCTIONALITY3 extends TC_LG_001_LOGOUT_FUNCTIONALITY {
	@Test
	public void immeditely_loggdin_after_Logging_out() {

		TC_LG_004_LOGOUT_FUNCTIONALITY3 logout2 = new TC_LG_004_LOGOUT_FUNCTIONALITY3();
		logout2.Logging_out();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("mobile_no_f1_00001")))
				.sendKeys((loc.getProperty("user_mobilelf1_00001")));
		driver.findElement(By.xpath(loc.getProperty("continuelf1"))).click();
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys((loc.getProperty("user_passwordlf1")));
		driver.findElement(By.xpath(loc.getProperty("click_signinlf1"))).click();

	}
}