package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_SF_001_SEARCH_FUNCTIONALITY extends basetestamzn {
	@Test
	public void search_existing_Product_Name() {
		driver.manage().window().maximize();
		driver.findElement(By.xpath(loc.getProperty("search_box_SF_001"))).sendKeys((loc.getProperty("product_name_SF_001")));
		driver.findElement(By.xpath(loc.getProperty("search_button_SF_001"))).click();

	}
}
