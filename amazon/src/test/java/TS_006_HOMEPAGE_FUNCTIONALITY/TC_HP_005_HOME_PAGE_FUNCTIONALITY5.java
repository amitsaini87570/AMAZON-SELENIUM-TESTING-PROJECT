package TS_006_HOMEPAGE_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_HP_005_HOME_PAGE_FUNCTIONALITY5 extends basetestamzn {
	@Test
	public void url_title_home_page() {

		driver.manage().window().maximize();
		driver.get((loc.getProperty("another_pagehp_001")));
		driver.findElement(By.xpath(loc.getProperty("amazon_logohp_001"))).click();

		// verify title
		// get the actual title
		String actual_title13 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title13);
		// expected title from locator properties
		String expected_title005 = (loc.getProperty("expected_title005"));
		// verifying the title
		Assert.assertEquals(actual_title13, expected_title005, "title not matched");

		// verify url
		// get the actual url
		String actual_url13 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url13);
		// expected url from locator properties
		String expected_url005 = (loc.getProperty("expected_url005"));
		// verifying the url
		Assert.assertEquals(actual_url13, expected_url005, "url not matched");

	}
}
