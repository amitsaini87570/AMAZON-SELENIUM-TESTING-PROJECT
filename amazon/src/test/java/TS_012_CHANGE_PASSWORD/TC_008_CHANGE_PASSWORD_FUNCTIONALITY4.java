package TS_012_CHANGE_PASSWORD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import baseclass_amazon.basetestamzn;

public class TC_008_CHANGE_PASSWORD_FUNCTIONALITY4 extends TC_001_CHANGE_PASSWORD_FUNCTIONALITY {
	@Test
	public void validate_title_url() {
		TC_008_CHANGE_PASSWORD_FUNCTIONALITY4 cp_001 = new TC_008_CHANGE_PASSWORD_FUNCTIONALITY4();
		cp_001.navigate_to_change_password_page();

		// verify title
		// get the actual title
		String actual_title13 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title13);
		// expected title from locator properties
		String expected_title005 = (loc.getProperty("expected_title_cp_008"));
		// verifying the title
		Assert.assertEquals(actual_title13, expected_title005, "title not matched");

		// verify url
		// get the actual url
		String actual_url13 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url13);
		// expected url from locator properties
		String expected_url005 = (loc.getProperty("expected_url_cp_008"));
		// verifying the url
		Assert.assertEquals(actual_url13, expected_url005, "url not matched");

	}
}
