package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_008_LOGIN_FUNCTIONALITY3 extends basetestamzn {
	@Test
	public void back_after_logout_TC_LF_008() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_no8"))).sendKeys((loc.getProperty("user_mobile8")));
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();
		driver.findElement(By.xpath(loc.getProperty("password8"))).sendKeys((loc.getProperty("user_password8")));
		driver.findElement(By.xpath(loc.getProperty("keep_login1"))).click();
		driver.findElement(By.xpath(loc.getProperty("click_signin"))).click();

		// mouse hover
		WebElement sign_in_account_button1 = driver
				.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover1")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button1).perform();

		driver.findElement(By.xpath(loc.getProperty("click_on_logout"))).click();
		System.out.println("backking");
		driver.navigate().back();
		System.out.println("backkied");

		// user is logged out
		Assert.assertTrue(false);
	}
}
