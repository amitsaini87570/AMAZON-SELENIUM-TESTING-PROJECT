package TS_009_WISH_LIST_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_LF_001_LOGIN_FUNCTIONALITY;
import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_002_ADD_TO_CART_FUNCTIONALITY;

public class TC_WL_003_ADD_TO_WISHLIST2 extends TC_LF_001_LOGIN_FUNCTIONALITY {
	@Test
	public void WITHOUT_add_PRODUCT_wishlist_() {
		TC_WL_003_ADD_TO_WISHLIST2 wl_003 = new TC_WL_003_ADD_TO_WISHLIST2();
		wl_003.logging_valid_credentials_TC_LF_001();
		// mouse hover
		WebElement sign_in_account_button = driver
				.findElement(By.xpath(loc.getProperty("click_on_signin_account_mouse_hover")));
		Actions action = new Actions(driver);
		action.moveToElement(sign_in_account_button).perform();
		// click on YPOUR WISHLIST
		driver.findElement(By.xpath(loc.getProperty("click_on_YOUR_WISHlIST_ATC002"))).click();

	}

}
