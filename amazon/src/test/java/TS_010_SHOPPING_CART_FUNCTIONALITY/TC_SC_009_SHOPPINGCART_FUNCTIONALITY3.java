package TS_010_SHOPPING_CART_FUNCTIONALITY;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_007_PRODUCT_DISPLAY_PAGE.TC_PDP_001_PRODUCT_DISPLAY_PAGE;
import TS_008_ADD_TO_CART_FUNCTIONALITY.TC_ATC_001_ADD_TO_CART_FUNCTIONALITY;

public class TC_SC_009_SHOPPINGCART_FUNCTIONALITY3 extends TC_SC_001_SHOPPINGCART_FUNCTIONALITY {
	@Test
	public void Validate_shopping_cart_to_checkout() {

		TC_SC_009_SHOPPINGCART_FUNCTIONALITY3 atc_001 = new TC_SC_009_SHOPPINGCART_FUNCTIONALITY3();
		atc_001.success_message_to_shoppingCart();
//click_ on CHECKOUT
		driver.findElement(By.xpath(loc.getProperty("clcik_on_proceed_to_checkout_sc009"))).click();

	}
}
