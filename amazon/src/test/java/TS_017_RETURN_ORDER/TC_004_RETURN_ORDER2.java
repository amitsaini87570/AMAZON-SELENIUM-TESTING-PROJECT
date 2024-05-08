package TS_017_RETURN_ORDER;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import TS_016_ORDER_INFORMATION.TS_OHI__016_003_ORDER_INFORMATION3;

public class TC_004_RETURN_ORDER2 extends TS_OHI__016_003_ORDER_INFORMATION3 {
	@Test
	public void title_url() {

		TS_OHI__016_003_ORDER_INFORMATION3 tc_oh_001 = new TS_OHI__016_003_ORDER_INFORMATION3();
		tc_oh_001.validate_to_return_order();

		// verify title
		// get the actual title
		String actual_title13 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title13);
		// expected title from locator properties
		String expected_title005 = (loc.getProperty("expected_title_pr_004"));
		// verifying the title
		Assert.assertEquals(actual_title13, expected_title005, "title not matched");

		// verify url
		// get the actual url
		String actual_url13 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url13);
		// expected url from locator properties
		String expected_url005 = (loc.getProperty("expected_url_pr_004"));
		// verifying the url
		Assert.assertEquals(actual_url13, expected_url005, "url not matched");

	}
}
