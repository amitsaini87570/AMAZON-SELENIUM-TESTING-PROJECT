package TS_007_PRODUCT_DISPLAY_PAGE;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;

public class TC_PDP_004_PRODUCT_DISPLAY_PAGE4 extends TC_LF_001_LOGIN_FUNCTIONALITY {

	public void validate_wishlist1() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

//login to application
		TC_PDP_004_PRODUCT_DISPLAY_PAGE4 display_pdp_001 = new TC_PDP_004_PRODUCT_DISPLAY_PAGE4();
		display_pdp_001.logging_valid_credentials_TC_LF_001();

		// search box
		driver.findElement(By.xpath(loc.getProperty("search_boxPDP_001")))
				.sendKeys((loc.getProperty("product_namePDP_001")));
		// click on search box
		driver.findElement(By.xpath(loc.getProperty("search_buttonPDP_001"))).click();

		// scroll
		WebElement scroll = driver.findElement(By.xpath(loc.getProperty("scrool_add_to_caret_buttonTC_PDP_001")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		// click on add to cart
		driver.findElement(By.xpath(loc.getProperty("add_tocart_ButtonTC_PDP_001"))).click();
		// click on image product
		driver.findElement(By.xpath(loc.getProperty("click_on_product_imageTC_PDP_001"))).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> it = windowhandles.iterator();
		String pw = it.next();
		System.out.println(pw);
		String cw = it.next();
		System.out.println(cw);
		driver.switchTo().window(cw);

		// again scroll
		WebElement scroll2 = driver.findElement(By.xpath(loc.getProperty("colour_scroll_element_tc_004_pdp")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll2);

		// add to wish list
		driver.findElement(By.xpath(loc.getProperty("add_to_wish_listPDP_001"))).click();

		WebElement added_webelement = driver.findElement(By.xpath(loc.getProperty("one_item_added_xpathPDP_001")));
		String actual_product_added_wishlist = added_webelement.getText();
		WebElement Expected_product_added_wishList = driver
				.findElement(By.xpath(loc.getProperty("item_add_textPDP_001")));
		System.out.println("product text added is ..." + actual_product_added_wishlist);
		Assert.assertEquals(actual_product_added_wishlist, Expected_product_added_wishList, "text not matched");

		// click_on_cross_button
		driver.findElement(By.xpath(loc.getProperty("click_on_cross_buttonPDP_001"))).click();

	}
}