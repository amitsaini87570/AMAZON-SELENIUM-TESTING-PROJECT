package TS_009_WISH_LIST_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_002_ADD_TO_CART_FUNCTIONALITY;

public class TC_WL_002_ADD_TO_WISHLIST2 extends TC_ATC_002_ADD_TO_CART_FUNCTIONALITY {
	public void add_wishlist_product() {

		TC_WL_002_ADD_TO_WISHLIST2 TC_wl001 = new TC_WL_002_ADD_TO_WISHLIST2();
		TC_wl001.navigate_to_product_display_page();

		// add to wishlist
		driver.findElement(By.xpath(loc.getProperty("add_to_wish_listPDP_001"))).click();

		// click_on_cross_button
		driver.findElement(By.xpath(loc.getProperty("click_on_cross_buttonPDP_001"))).click();

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		// scroll up
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement scroll3 = driver.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll3);

		// mouse hover
		WebElement sign_in_account_button = driver
				.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button).perform();
		// click on YPOUR WISHLIST
		driver.findElement(By.xpath(loc.getProperty("click_on_YOUR_WISHlIST_ATC002"))).click();
		// click on add to cart
		driver.findElement(By.xpath(loc.getProperty("clickon_addtocart_arc_002"))).click();

	}

	@Test

	public void verify_utl_title() {
		TC_WL_002_ADD_TO_WISHLIST2 TC_wl002 = new TC_WL_002_ADD_TO_WISHLIST2();
		TC_wl002.add_wishlist_product();

		// verify title
		// get the actual title
		String actual_title10 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title10);
		// expected title from locator properties
		String expected_title10 = (loc.getProperty("expected_title_wl_002"));
		// verifying the title
		Assert.assertEquals(actual_title10, expected_title10, "title not matched");

		// verify url
		// get the actual url
		String actual_url10 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url10);
		// expected url from locator properties
		String expected_url10 = (loc.getProperty("expected_url_wl_002"));
		// verifying the url
		Assert.assertEquals(actual_url10, expected_url10, "url not matched");

	}

}
