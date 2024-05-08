package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_SF_009ARCH_FUNCTIONALITY3 extends basetestamzn {
	@Test
	public void title_url_validate() {
		driver.manage().window().maximize();

		// verify title
		// get the actual title
		String actual_title09 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title09);
		// expected title from locator properties
		String expected_title09 = (loc.getProperty("expected_title13"));
		// verifying the title
		Assert.assertEquals(actual_title09, expected_title09, "title not matched");

        //verify url
		// get the actual url
		String actual_url09 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url09);
		// expected url from locator properties
		String expected_url09 = (loc.getProperty("expected_url09"));
		// verifying the url
		Assert.assertEquals(actual_url09, expected_url09, "url not matched");

	}
}
