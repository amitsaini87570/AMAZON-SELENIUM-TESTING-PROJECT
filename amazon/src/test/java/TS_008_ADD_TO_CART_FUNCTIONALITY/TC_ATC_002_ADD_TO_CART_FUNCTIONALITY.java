package TS_008_ADD_TO_CART_FUNCTIONALITY;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;

public class TC_ATC_002_ADD_TO_CART_FUNCTIONALITY extends TC_LF_001_LOGIN_FUNCTIONALITY {

	public void navigate_to_product_display_page() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

//login to application
		TC_ATC_002_ADD_TO_CART_FUNCTIONALITY display_pdp_001 = new TC_ATC_002_ADD_TO_CART_FUNCTIONALITY();
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
		driver.findElement(By.xpath(loc.getProperty("click_on_product_imageTC_PDP_0001"))).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> it = windowhandles.iterator();
		String pw = it.next();
		System.out.println(pw);
		String cw = it.next();
		System.out.println(cw);
		driver.switchTo().window(cw);

		// again scroll
		WebElement scroll2 = driver.findElement(By.xpath(loc.getProperty("colour_scroll_element_tc_003_pdp")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll2);
	}

	@Test
	public void validate_ADDTOCART_FROM_wishlist() {

		TC_ATC_002_ADD_TO_CART_FUNCTIONALITY TC_PDP004 = new TC_ATC_002_ADD_TO_CART_FUNCTIONALITY();
		TC_PDP004.navigate_to_product_display_page();

		// add to wishlist
		driver.findElement(By.xpath(loc.getProperty("add_to_wish_listPDP_001"))).click();

		WebElement added_webelement = driver.findElement(By.xpath(loc.getProperty("one_item_added_xpathPDP_001")));
		String actual_product_added_wishlist = added_webelement.getText();
		WebElement Expected_product_added_wishList = driver
				.findElement(By.xpath(loc.getProperty("item_add_textPDP_001")));
		System.out.println("product text added is ..." + actual_product_added_wishlist);
		Assert.assertEquals(actual_product_added_wishlist, Expected_product_added_wishList, "text not matched");

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
}