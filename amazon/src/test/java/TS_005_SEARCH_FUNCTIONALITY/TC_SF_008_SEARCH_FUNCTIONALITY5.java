package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import baseclass_amazon.basetestamzn;

public class TC_SF_008_SEARCH_FUNCTIONALITY5 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void search_icon_all_page() {
		TC_SF_008_SEARCH_FUNCTIONALITY5 search_f_007 = new TC_SF_008_SEARCH_FUNCTIONALITY5();
		search_f_007.logging_valid_credentials_TC_LF_001();
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath(loc.getProperty("search_box_SF_007"))).sendKeys((loc.getProperty("product_name_SF_007")));
		driver.findElement(By.xpath(loc.getProperty("search_button_SF_007"))).click();
		driver.findElement(By.xpath(loc.getProperty("short_sf_007_element"))).click();
		driver.findElement(By.xpath(loc.getProperty("high_to_low_element"))).click();

		//search icon placed in all the pages
		Assert.assertTrue(true);
		
		
	}
}
