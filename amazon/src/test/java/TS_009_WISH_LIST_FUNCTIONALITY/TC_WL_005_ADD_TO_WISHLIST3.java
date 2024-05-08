package TS_009_WISH_LIST_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_002_ADD_TO_CART_FUNCTIONALITY;

public class TC_WL_005_ADD_TO_WISHLIST3 extends TC_ATC_002_ADD_TO_CART_FUNCTIONALITY {
	@Test
	public void add_wishlist_only_1_product() {

		TC_WL_005_ADD_TO_WISHLIST3 TC_wl001 = new TC_WL_005_ADD_TO_WISHLIST3();
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

		// REMOVING PRODUCT FROM WISHLIST
		driver.findElement(By.xpath(loc.getProperty("remove_productWL_005"))).click();

	}

}
