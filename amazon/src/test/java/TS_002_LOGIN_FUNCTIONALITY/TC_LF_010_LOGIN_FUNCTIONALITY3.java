package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_010_LOGIN_FUNCTIONALITY3 extends basetestamzn {
	@Test
	public void password_copy_TC_LF_010() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_no10"))).sendKeys((loc.getProperty("user_mobile10")));
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();
		driver.findElement(By.xpath(loc.getProperty("password10"))).sendKeys((loc.getProperty("user_password10")));
		WebElement sourceArea = driver.findElement(By.xpath(loc.getProperty("password9")));
		Actions action = new Actions(driver);
		action.keyDown(sourceArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		action.contextClick(sourceArea);

		// right click is disable in password field

		driver.findElement(By.xpath(loc.getProperty("password9"))).clear();
		action.keyDown(sourceArea, Keys.CONTROL).sendKeys("v").build().perform();

	}
}
