package TS_003_LOGOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LG_002_LOGOUT_FUNCTIONALITY2 extends TC_LG_001_LOGOUT_FUNCTIONALITY {
	@Test
	public void Logging_out_back_TC_LG_002() {
		TC_LG_002_LOGOUT_FUNCTIONALITY2 logout2 = new TC_LG_002_LOGOUT_FUNCTIONALITY2();
		logout2.Logging_out();
		driver.navigate().back();
		driver.findElement(By.xpath(loc.getProperty("keep_login1lf1"))).click();

	}
}