package TS_006_HOMEPAGE_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_HP_004_HOME_PAGE_FUNCTIONALITY4 extends basetestamzn{
	@Test
	public void all_supported_environments(){
		
		driver.manage().window().maximize();
		driver.get((loc.getProperty("another_pagehp_001")));
		driver.findElement(By.xpath(loc.getProperty("amazon_logohp_001"))).click();
		//  'Register Account' functionality is working in all the supported environments

	}
}
