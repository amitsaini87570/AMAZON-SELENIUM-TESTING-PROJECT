package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_SF_002ARCH_FUNCTIONALITY2 extends basetestamzn {
	@Test
	public void search_non_existing_Product_Name() {
		driver.manage().window().maximize();
		driver.findElement(By.xpath(loc.getProperty("search_box_SF_002"))).sendKeys((loc.getProperty("product_name_SF_002")));
		driver.findElement(By.xpath(loc.getProperty("search_button_SF_002"))).click();

	}
}
