package TS_018_CONTECT_US;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;

public class TC_003_CONTECT_US3 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void validate_url_title() {
		TC_003_CONTECT_US3 tc_001_cs = new TC_003_CONTECT_US3();
		tc_001_cs.logging_valid_credentials_TC_LF_001();

		driver.manage().window().maximize();
		// mouse hover
		WebElement sign_in_account_button = driver
				.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover_tc_cs_001")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button).perform();
//click on your accountt
		driver.findElement(By.xpath(loc.getProperty("click_on_my_account_tc_Cs_001"))).click();
//click on contect us 
		driver.findElement(By.xpath(loc.getProperty("click_on_contect_us_tc_cs_001"))).click();

		// verify title
		// get the actual title
		String actual_title13 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title13);
		// expected title from locator properties
		String expected_title005 = (loc.getProperty("expected_title_cs_005"));
		// verifying the title
		Assert.assertEquals(actual_title13, expected_title005, "title not matched");

		// verify url
		// get the actual url
		String actual_url13 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url13);
		// expected url from locator properties
		String expected_url005 = (loc.getProperty("expected_url_cs_005"));
		// verifying the url
		Assert.assertEquals(actual_url13, expected_url005, "url not matched");

	}
}
