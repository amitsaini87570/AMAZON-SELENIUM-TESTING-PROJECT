package TS_006_HOMEPAGE_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_HP_003_HOME_PAGE_FUNCTIONALITY3 extends basetestamzn{
	@Test
	public void UI_interface() {
		
		driver.manage().window().maximize();
		driver.get((loc.getProperty("another_pagehp_001")));
		driver.findElement(By.xpath(loc.getProperty("amazon_logohp_001"))).click();
		//  Proper and good UI are displayed on the 'Register Account' page

	}
}
