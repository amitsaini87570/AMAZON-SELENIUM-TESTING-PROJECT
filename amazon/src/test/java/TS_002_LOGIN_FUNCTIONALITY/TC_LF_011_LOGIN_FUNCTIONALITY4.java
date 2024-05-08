package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_011_LOGIN_FUNCTIONALITY4 extends basetestamzn {
	@Test
	public void password_not_visible_in_source_code_TC_LF_011() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_no11"))).sendKeys((loc.getProperty("user_mobile11")));
		driver.findElement(By.xpath(loc.getProperty("continue1"))).click();
		driver.findElement(By.xpath(loc.getProperty("password11"))).sendKeys((loc.getProperty("user_password11")));
		WebElement sourceArea = driver.findElement(By.xpath(loc.getProperty("password11")));
		Actions action = new Actions(driver);
		action.keyDown(sourceArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		action.contextClick();

		// right click is disable in password field
		WebElement sourceArea_blank = driver.findElement(By.xpath(loc.getProperty("click_on_blank")));
		action.contextClick(sourceArea_blank);
		action.keyDown(sourceArea, Keys.CONTROL).sendKeys("u");

	}
}
