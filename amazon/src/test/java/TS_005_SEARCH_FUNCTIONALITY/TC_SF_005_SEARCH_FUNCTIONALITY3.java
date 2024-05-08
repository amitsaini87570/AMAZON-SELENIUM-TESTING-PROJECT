package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import baseclass_amazon.basetestamzn;

public class TC_SF_005_SEARCH_FUNCTIONALITY3 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void multiple_product_result() {
		TC_SF_005_SEARCH_FUNCTIONALITY3 search_f_005 = new TC_SF_005_SEARCH_FUNCTIONALITY3();
		search_f_005.logging_valid_credentials_TC_LF_001();
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath(loc.getProperty("search_box_SF_005"))).sendKeys((loc.getProperty("product_name_SF_005")));
		driver.findElement(By.xpath(loc.getProperty("search_button_SF_005"))).click();
         
	}
}
