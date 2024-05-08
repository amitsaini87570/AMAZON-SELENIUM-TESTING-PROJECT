package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_SF_003ARCH_FUNCTIONALITY3 extends basetestamzn {
	@Test
	public void search_non_existing_Product_Name() {
		driver.manage().window().maximize();
		driver.findElement(By.xpath(loc.getProperty("search_button_SF_003"))).click();

	}
}
