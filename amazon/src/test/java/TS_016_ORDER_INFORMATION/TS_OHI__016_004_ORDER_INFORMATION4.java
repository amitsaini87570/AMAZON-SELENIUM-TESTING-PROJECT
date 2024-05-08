package TS_016_ORDER_INFORMATION;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import TS_015_ORDER_HISTORY.TS_015_003_ORDER_HISTORY3;
import TS_015_ORDER_HISTORY.TS_015_007_ORDER_HISTORY6;

public class TS_OHI__016_004_ORDER_INFORMATION4 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void validate_title_url() {

		TS_OHI__016_004_ORDER_INFORMATION4 tc_oh_001 = new TS_OHI__016_004_ORDER_INFORMATION4();
		tc_oh_001.logging_valid_credentials_TC_LF_001();

		driver.findElement(By.xpath(loc.getProperty("click_on_order_history_oi_003"))).click();

		// verify title
		// get the actual title
		String actual_title13 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title13);
		// expected title from locator properties
		String expected_title005 = (loc.getProperty("expected_title_ohi_004"));
		// verifying the title
		Assert.assertEquals(actual_title13, expected_title005, "title not matched");

		// verify url
		// get the actual url
		String actual_url13 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url13);
		// expected url from locator properties
		String expected_url005 = (loc.getProperty("expected_url_ohi_004"));
		// verifying the url
		Assert.assertEquals(actual_url13, expected_url005, "url not matched");

	}
}
