package TS_003_LOGOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LG_005_LOGOUT_FUNCTIONALITY2 extends TC_LG_001_LOGOUT_FUNCTIONALITY {
	@Test
	public void Logging_title_url() {

		TC_LG_005_LOGOUT_FUNCTIONALITY2 logout5 = new TC_LG_005_LOGOUT_FUNCTIONALITY2();
		logout5.Logging_out();

		// verify title
		// get the actual title
		String actual_titlelof = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_titlelof);
		// expected title from locator properties
		String expected_titlelof = (loc.getProperty("expected_titlelof"));
		// verifying the title
		Assert.assertEquals(actual_titlelof, expected_titlelof, "title not matched");

//verify url
		// get the actual url
		String actual_urllof = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_urllof);
		// expected url from locator properties
		String expected_urllof = (loc.getProperty("expected_urllof_lo_005"));
		// verifying the url
		Assert.assertEquals(actual_urllof, expected_urllof, "url not matched");

	}
}