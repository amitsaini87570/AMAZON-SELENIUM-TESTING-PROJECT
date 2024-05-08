package TS_002_LOGIN_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass_amazon.basetestamzn;

public class TC_LF_013_LOGIN_FUNCTIONALITY2 extends basetestamzn {
	@Test
	public void logging_title_url_TC_LF_013() {

		driver.manage().window().maximize();

		// login to amazon
		driver.findElement(By.xpath(loc.getProperty("click_on_signin"))).click();

		// verify title
		// get the actual title
		String actual_title13 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title13);
		// expected title from locator properties
		String expected_title13 = (loc.getProperty("expected_title13"));
		// verifying the title
		Assert.assertEquals(actual_title13, expected_title13, "title not matched");

		// verify url
		// get the actual url
		String actual_url13 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url13);
		// expected url from locator properties
		String expected_url13 = (loc.getProperty("expected_url13"));
		// verifying the url
		Assert.assertEquals(actual_url13, expected_url13, "url not matched");

	}
}
