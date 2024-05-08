package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_009_LOGIN_FUNCTIONALITY2 extends basetestamzn {
	@Test
	public void password_toggle_star_symbol_TC_LF_009() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		driver.findElement(By.xpath(loc.getProperty("user_mobilel_f_009"))).sendKeys((loc.getProperty("user_mobile9")));
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();
		driver.findElement(By.xpath(loc.getProperty("password9"))).sendKeys((loc.getProperty("user_password9")));

	}
}
