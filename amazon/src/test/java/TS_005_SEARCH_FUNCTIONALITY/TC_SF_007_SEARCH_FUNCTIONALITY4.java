package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import baseclass_amazon.basetestamzn;

public class TC_SF_007_SEARCH_FUNCTIONALITY4 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void short_product() {
		TC_SF_007_SEARCH_FUNCTIONALITY4 search_f_007 = new TC_SF_007_SEARCH_FUNCTIONALITY4();
		search_f_007.logging_valid_credentials_TC_LF_001();

		driver.manage().window().maximize();
		driver.findElement(By.xpath(loc.getProperty("search_box_SF_007")))
				.sendKeys((loc.getProperty("product_name_SF_007")));
		driver.findElement(By.xpath(loc.getProperty("search_button_SF_007"))).click();
		driver.findElement(By.xpath(loc.getProperty("short_sf_007_element"))).click();
		driver.findElement(By.xpath(loc.getProperty("high_to_low_element"))).click();

		// element is sorted high to low price

	}
}
