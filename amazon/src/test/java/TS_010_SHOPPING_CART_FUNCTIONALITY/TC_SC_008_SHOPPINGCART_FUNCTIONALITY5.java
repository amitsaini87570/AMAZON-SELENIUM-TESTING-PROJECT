package TS_010_SHOPPING_CART_FUNCTIONALITY;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_007_PRODUCT_DISPLAY_PAGE.TC_PDP_001_PRODUCT_DISPLAY_PAGE;
import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_001_ADD_TO_CART_FUNCTIONALITY;

public class TC_SC_008_SHOPPINGCART_FUNCTIONALITY5 extends TC_SC_001_SHOPPINGCART_FUNCTIONALITY {
	@Test
	public void Validate_url_title() {

		TC_SC_008_SHOPPINGCART_FUNCTIONALITY5 atc_001 = new TC_SC_008_SHOPPINGCART_FUNCTIONALITY5();
		atc_001.success_message_to_shoppingCart();

		// verify title
		// get the actual title
		String actual_title09 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title09);
		// expected title from locator properties
		String expected_title08 = (loc.getProperty("expected_title_sc_008"));
		// verifying the title
		Assert.assertEquals(actual_title09, expected_title08, "title not matched");

		// verify url
		// get the actual url
		String actual_url09 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url09);
		// expected url from locator properties
		String expected_url08 = (loc.getProperty("expected_url09_sc_008"));
		// verifying the url
		Assert.assertEquals(actual_url09, expected_url08, "url not matched");

	}
}
