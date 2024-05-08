package TS_015_ORDER_HISTORY;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;

public class TS_015_005_ORDER_HISTORY5 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void order_DISPLAYED_002() {
		TS_015_005_ORDER_HISTORY5 tc_oh_001 = new TS_015_005_ORDER_HISTORY5();
		tc_oh_001.logging_valid_credentials_TC_LF_001();

		driver.findElement(By.xpath(loc.getProperty("click_on_order_history_oh_001"))).click();

		// verify title
		// get the actual title
		String actual_title13 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title13);
		// expected title from locator properties
		String expected_title005 = (loc.getProperty("expected_title_oh_005"));
		// verifying the title
		Assert.assertEquals(actual_title13, expected_title005, "title not matched");

		// verify url
		// get the actual url
		String actual_url13 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url13);
		// expected url from locator properties
		String expected_url005 = (loc.getProperty("expected_url_oh_005"));
		// verifying the url
		Assert.assertEquals(actual_url13, expected_url005, "url not matched");

	}

}
