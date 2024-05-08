package TS_013_MY_ACCOUNT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_011CHECKOUT_FUNCTIONALITY.TC_CO_003_CHECKOUT_FUNCTIONALITY3;

public class TC_MA_003_MY_ACCOUNT2 extends TC_MA_001_MY_ACCOUNT {
	@Test
	public void validate_title_url() {

		// mouse hover
		WebElement sign_in_account_button = driver
				.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover_TC_MA_001")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button).perform();
		// click on my account
		driver.findElement(By.xpath(loc.getProperty("click_on_my_account_TC_ma_001"))).click();

		// verify title
		// get the actual title
		String actual_title13 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title13);
		// expected title from locator properties
		String expected_title005 = (loc.getProperty("expected_title_cp_008TC_MA_003"));
		// verifying the title
		Assert.assertEquals(actual_title13, expected_title005, "title not matched");

		// verify url
		// get the actual url
		String actual_url13 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url13);
		// expected url from locator properties
		String expected_url005 = (loc.getProperty("expected_url_cp_008TC_MA_003"));
		// verifying the url
		Assert.assertEquals(actual_url13, expected_url005, "url not matched");

	}

}
